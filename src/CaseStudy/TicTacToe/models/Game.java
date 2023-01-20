package CaseStudy.TicTacToe.models;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import CaseStudy.TicTacToe.exceptions.PersonWithDuplicateSymbolFoundException;
import CaseStudy.TicTacToe.strategy.WinningStrategy;

public class Game {
    private Board board;
    private List<Player> player;  //circular queue (p1,p2,p3,p4,p5)

    private int playerNextMoveIndex;

    private List<WinningStrategy> winningStrategies;
    private List<Move> move;
    private Player winner;
    private GameStatus gameStatus;
    private int filledCells;
    

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }

    //static class
    public static GameBuilder getBuilder() {
        return new GameBuilder();
    }
    
    private Game(){
    }

    public Game(GameBuilder gameBuilder) {
        this.player = gameBuilder.player;
        this.board = new Board(gameBuilder.sizeOfBoard);
        this.gameStatus = GameStatus.NOT_STARTED;
        this.move = new ArrayList<>();
        this.playerNextMoveIndex = 0;
        this.winningStrategies = gameBuilder.winningStrategies;
    }

    public static class GameBuilder {
        private List<Player> player;  //queue!!!
        private List<WinningStrategy> winningStrategies;
        private int sizeOfBoard;

        public GameBuilder setPlayer(List<Player> player) {
            this.player = new ArrayList<>();
            this.player.addAll(player); //copy
            return this;
        }
       
        public GameBuilder setWinningStrategies(List<WinningStrategy> winningStrategies) {
            this.winningStrategies = winningStrategies;
            return this;
        }

        public GameBuilder setSizeOfBoard(int size) {
            this.sizeOfBoard = size;
            return this;
        }

        private boolean validatePlayersSymbols(){
            Set<Character> set = new HashSet<>();
            for(Player p:player) {
                if(set.contains(p.getSymbol().getCharSymbol())) { //duplicate!!
                    throw new PersonWithDuplicateSymbolFoundException("Duplicate Symbol");
                } 
                set.add(p.getSymbol().getCharSymbol());
            }
            return true;
        }

        public Game build(){
            // validation should be to validate if all symbols are uique before building the game
            if(validatePlayersSymbols() && onlyOneOrNoBotPresent() && noOfPlayerCheck())
                return new Game(this);

            return null;
        }

        private boolean noOfPlayerCheck() {
            // if the size of the board is n, then no of players can be between 2 and n-1
            return true;
        }

        private boolean onlyOneOrNoBotPresent() {  //notmoreThan2Bot
            // only one bot players!!
            return true;
        }

        
    }

    public void play() {
        board.display();
        gameStatus = GameStatus.IN_PROGRESS;

        //Use the playerNextMoveIndex to let the player move

        Move potentialMove = this.player.get(playerNextMoveIndex).makeMove(board);

        //validation
        if(this.board.getMatrix().get(potentialMove.getRow()).get(potentialMove.getCol()).getPlayer() != null) {
            System.out.println("Wrong Move, Cell already occupied, Please try again!");
            return;
        }

        //fill the cell
        this.board.getMatrix().get(potentialMove.getRow())
        .get(potentialMove.getCol()).setPlayer(potentialMove.getPlayer());
        //add to move
        this.move.add(potentialMove);
        //preseve the count
        filledCells++;

        //check Win or not
        boolean win = false;
        for(WinningStrategy ws:winningStrategies) {
            win = ws.checkWin(board, potentialMove);
            if(win) {
                System.out.println("Winner is:"+potentialMove.getPlayer().getName());
                gameStatus = GameStatus.WIN;
                winner=potentialMove.getPlayer(); //setting winner!
                return;
            }
        }

        playerNextMoveIndex++;  //(p1,p2)
        playerNextMoveIndex = playerNextMoveIndex%player.size();
        
        //O(1) check to know about DRAW
        if(filledCells == this.board.getN()*this.board.getN()) {
            gameStatus = GameStatus.DRAW;
            return;
        }

    }
}
