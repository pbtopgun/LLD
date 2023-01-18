package CaseStudy.TicTacToe.strategy;

import CaseStudy.TicTacToe.models.Board;
import CaseStudy.TicTacToe.models.Move;
import CaseStudy.TicTacToe.models.Player;

public interface BotMoveStrategy {
    Move makeMove(Board board,Player player);
}
