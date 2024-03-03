package TicTacToe.Strategy.WinningStrategies;

import TicTacToe.Model.Board;
import TicTacToe.Model.Move;
import TicTacToe.Model.Player;

public interface WinningStrategy {
    boolean checkWinner(Move move, Board board);
}
