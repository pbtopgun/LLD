package CaseStudy.TicTacToe.models;

public class Bot extends Player{
    private BotDifficultyLevel botDifficultyLevel;
    private BotMoveStrategy botMoveStrategy;

    public Bot(BotDifficultyLevel botDifficultyLevel) {
        this.botDifficultyLevel = botDifficultyLevel;
        this.botMoveStrategy = BotMoveStrategyFactory.getInstance(botDifficultyLevel);
    }

    public BotDifficultyLevel getBotDifficultyLevel() {
        return botDifficultyLevel;
    }

}
