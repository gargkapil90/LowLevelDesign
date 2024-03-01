package TicTacToe.Strategy;

import TicTacToe.Modal.Board;
import TicTacToe.Modal.Player;

public class RowWinningStrategy implements WinningStrategy {
    @Override
    public boolean checkWinner(Player player, Board board) {
        return false;
    }
}
