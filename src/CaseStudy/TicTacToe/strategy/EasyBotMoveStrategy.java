package CaseStudy.TicTacToe.strategy;

import CaseStudy.TicTacToe.models.Board;
import CaseStudy.TicTacToe.models.Move;
import CaseStudy.TicTacToe.models.Player;

public class EasyBotMoveStrategy implements BotMoveStrategy{

    @Override
    public Move makeMove(Board board, Player player) {
        int size = board.getN();
        for(int row=0;row<size;row++) {
            for(int col=0;col<size;col++) {
                if(board.getMatrix().get(row).get(col).getPlayer() == null) {
                    return new Move(row,col,player);
                }
            }
        }
        
        return null;
    }
    
}
