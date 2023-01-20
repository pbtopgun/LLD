package CaseStudy.TicTacToe.models;

import CaseStudy.TicTacToe.factory.BotMoveStrategyFactory;
import CaseStudy.TicTacToe.strategy.BotMoveStrategy;

public class Bot extends Player{
    private BotDifficultyLevel botDifficultyLevel;
    private BotMoveStrategy botMoveStrategy;

    public Bot(BotDifficultyLevel botDifficultyLevel,Symbol symbol,String name) {
        super(name,symbol,PlayerType.BOT);
        this.botDifficultyLevel = botDifficultyLevel;
        this.botMoveStrategy = BotMoveStrategyFactory.getInstance(botDifficultyLevel);
    }

    public BotDifficultyLevel getBotDifficultyLevel() {
        return botDifficultyLevel;
    }

    @Override
    public Move makeMove(Board board) {
        // TODO Auto-generated method stub
        return botMoveStrategy.makeMove(board, this);
    }

}
