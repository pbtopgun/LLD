package CaseStudy.TicTacToe.models;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import CaseStudy.TicTacToe.exceptions.PersonWithDuplicateSymbolFoundException;
import CaseStudy.TicTacToe.strategy.WinningStrategy;

public class Game {
    private Board board;
    private List<Player> player;
    private int playerNextMoveIndex;
    private List<WinningStrategy> winningStrategies;
    private List<Move> move;
    private Player winner;
    private GameStatus gameStatus;

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
            player.addAll(player); //copy
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

        Game build(){
            // validation should be to validate if all symbols are uique before building the game
            if(validatePlayersSymbols() && onlyOneOrNoBotPresent() && noOfPlayerCheck())
                return new Game(this);
                
            return null;
        }

        private boolean noOfPlayerCheck() {
            return false;
        }

        private boolean onlyOneOrNoBotPresent() {
            return false;
        }

        
    }
}
