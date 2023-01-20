package CaseStudy.TicTacToe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import CaseStudy.TicTacToe.factory.WinningStrategyFactory;
import CaseStudy.TicTacToe.models.Bot;
import CaseStudy.TicTacToe.models.BotDifficultyLevel;
import CaseStudy.TicTacToe.models.Game;
import CaseStudy.TicTacToe.models.GameStatus;
import CaseStudy.TicTacToe.models.HumanPlayer;
import CaseStudy.TicTacToe.models.Player;
import CaseStudy.TicTacToe.models.Symbol;
import CaseStudy.TicTacToe.models.WinningStrategyType;
import CaseStudy.TicTacToe.strategy.WinningStrategy;

public class Client {
    public static void main(String[] args) throws Exception {

        System.out.println("!!GAME STARTS!!");
        Scanner scanner = new Scanner(System.in);

        System.out.println("!!What is the size of the Board ?");
        int sizeOfBoard = scanner.nextInt();
        System.out.println("!!Number of Human Player!!");
        int noOfHumanPlayers = scanner.nextInt();
        System.out.println("No of Bots!!");
        int noOfBots = scanner.nextInt();

        List<Player> players = new ArrayList<>();

        for(int i=0;i<noOfBots;i++) {
            System.out.println("Input symbol for bot:"+i);
            String symbol = scanner.next();
            System.out.println("Input Name for bot:"+i);
            String name = scanner.next();
            System.out.println("What is the difficulty level for bot:"+i);
            String difficultyLevel = scanner.next();
            players.add(new Bot(BotDifficultyLevel.valueOf(difficultyLevel),new Symbol(symbol.charAt(0)),name));
        }


        for(int i=0;i<noOfHumanPlayers;i++) {
            System.out.println("Input symbol for Human:"+i);
            String symbol = scanner.next();
            System.out.println("Input Name for Human:"+i);
            String name = scanner.next();
            players.add(new HumanPlayer(new Symbol(symbol.charAt(0)),name));
        }

        List<WinningStrategy> winningStrategies = new ArrayList<>();
        System.out.println("How Many Winning Strategy we want");
        int noOfWinningStrategy = scanner.nextInt();

        for(int i=0;i<noOfWinningStrategy;i++) {
            System.out.println("Input type for WinningStrategy:"+i);
            String winningStrategyType = scanner.next();
            winningStrategies.add(WinningStrategyFactory.getInstance
            (WinningStrategyType.valueOf(winningStrategyType)));

        }

        Game myGame = Game.getBuilder()
        .setPlayer(players)
        .setSizeOfBoard(sizeOfBoard)
        .setWinningStrategies(winningStrategies)
        .build();

        while(myGame.getGameStatus() == GameStatus.IN_PROGRESS 
        || myGame.getGameStatus() == GameStatus.NOT_STARTED) {
            myGame.play();
        }
    }
}



/***
 * 
 * class StringToBotDifficultLevelfactory{
 *      public static BotDifficultyLevel getEnum(String input) {
 *      switch(input) {
 *       case "MED" : BotDifficultyLevel.MED;
 *      }
 *  }
 * }
 * 
 * 
 */


/**
 * 
 * 1. Take inputs
 * 2. Build Game
 * 3. Play the game by implementing moves
 * 4. display the board
 * 5. undo
 * 6.
 * 
 */