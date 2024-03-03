package TicTacToe.Strategy.BotPlayingStrategies;

import TicTacToe.Model.Board;
import TicTacToe.Model.Move;

public interface BotPlayingStrategy {
    Move makeMove(Board board);
}
