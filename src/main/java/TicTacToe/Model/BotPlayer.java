package TicTacToe.Model;

import TicTacToe.Strategy.BotPlayingStrategies.BotPlayingStrategy;
import TicTacToe.Strategy.BotPlayingStrategies.BotPlayingStrategyFactory;

public class BotPlayer extends Player{
    DifficultyLevel difficultyLevel;
    BotPlayingStrategy botPlayingStrategy;

    public DifficultyLevel getDifficultyLevel() {
        return difficultyLevel;
    }

    public BotPlayer(int id, String name, Symbol symbol, DifficultyLevel difficultyLevel) {
        super(id, name, symbol, PlayerType.BOT);
        this.difficultyLevel = difficultyLevel;
        this.botPlayingStrategy = BotPlayingStrategyFactory.getBotPlayingStrategy(difficultyLevel);
    }

    public void setDifficultyLevel(DifficultyLevel difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    public Move makeMove(Board board){
        return botPlayingStrategy.makeMove(board);
    }
}
