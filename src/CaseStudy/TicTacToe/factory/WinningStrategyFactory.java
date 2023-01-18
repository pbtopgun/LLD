package CaseStudy.TicTacToe.factory;

import CaseStudy.TicTacToe.models.WinningStrategyType;
import CaseStudy.TicTacToe.strategy.FalseWinningStrategy;
import CaseStudy.TicTacToe.strategy.WinningStrategy;

public class WinningStrategyFactory {
    public static WinningStrategy getInstance(WinningStrategyType strategyType) {
        if(strategyType == WinningStrategyType.ROW) {
            return new FalseWinningStrategy();
        }
        return new FalseWinningStrategy();

    }
}
