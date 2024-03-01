package TicTacToe.Strategy;

import TicTacToe.Model.Board;
import TicTacToe.Model.Player;

public class RowWinningStrategy implements WinningStrategy {
    @Override
    public boolean checkWinner(Player player, Board board) {
        return false;
    }
}
