package TicTacToe.Strategy.BotPlayingStrategies;

import TicTacToe.Model.DifficultyLevel;

public class BotPlayingStrategyFactory {
    public static BotPlayingStrategy getBotPlayingStrategy(DifficultyLevel difficultyLevel){
        return new EasyBotPlayingStrategy();
    }
}
