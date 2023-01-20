package CaseStudy.TicTacToe.models;

import java.util.Scanner;

public class HumanPlayer extends Player{

    public HumanPlayer(Symbol symbol, String name) {
        super(name, symbol, PlayerType.HUMAN);
    }

    @Override
    public Move makeMove(Board board) {
        System.out.println("Tell me value of x");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println("Tell me value of y");
        int y = scanner.nextInt();
        return new Move(x, y, this);
    }
    
}
