package TicTacToe.Strategy;

import TicTacToe.Modal.Board;
import TicTacToe.Modal.Player;

public interface WinningStrategy {
    boolean checkWinner(Player player, Board board);
}
