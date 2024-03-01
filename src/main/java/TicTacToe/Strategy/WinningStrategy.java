package TicTacToe.Strategy;

import TicTacToe.Model.Board;
import TicTacToe.Model.Player;

public interface WinningStrategy {
    boolean checkWinner(Player player, Board board);
}
