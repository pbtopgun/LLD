package CaseStudy.TicTacToe.strategy;

import CaseStudy.TicTacToe.models.Board;
import CaseStudy.TicTacToe.models.Move;

public interface WinningStrategy {
    boolean checkWin(Board board,Move move);
}

////ROW, COL,DIAG....


/**
 * 
 * for each row:
 *  check if all the symbols are same,
 *  if yes return true 
 * 
 * return false
 * 
 */