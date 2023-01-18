package CaseStudy.TicTacToe.strategy;

import CaseStudy.TicTacToe.models.Board;
import CaseStudy.TicTacToe.models.Move;

public class FalseWinningStrategy implements WinningStrategy{

    @Override
    public boolean checkWin(Board board, Move move) {
        // TODO Auto-generated method stub
        return false;
    }
    
}
