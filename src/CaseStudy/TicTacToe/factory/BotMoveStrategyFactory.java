package CaseStudy.TicTacToe.factory;

import CaseStudy.TicTacToe.models.BotDifficultyLevel;
import CaseStudy.TicTacToe.strategy.BotMoveStrategy;
import CaseStudy.TicTacToe.strategy.EasyBotMoveStrategy;
import CaseStudy.TicTacToe.strategy.MedBotMoveStrategy;

public class BotMoveStrategyFactory {
    public static BotMoveStrategy getInstance(BotDifficultyLevel botDifficultyLevel) {
        if(botDifficultyLevel == BotDifficultyLevel.MED) {
            return new MedBotMoveStrategy();    
        }
        ///.some more check and returns for implementation
        return new EasyBotMoveStrategy();
    }
}
