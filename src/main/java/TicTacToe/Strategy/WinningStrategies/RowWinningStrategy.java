package TicTacToe.Strategy.WinningStrategies;

import TicTacToe.Model.Board;
import TicTacToe.Model.Move;
import TicTacToe.Model.Player;
import TicTacToe.Model.Symbol;

import java.util.HashMap;

public class RowWinningStrategy implements WinningStrategy {
    private HashMap<Integer, HashMap<Symbol, Integer>> counts = new HashMap<>();
    @Override
    public boolean checkWinner(Move move, Board board) {
        int row = move.getMove().getRow();
        Symbol symbol = move.getMove().getPlayer().getSymbol();
        if(!counts.containsKey(row)){
            counts.put(row, new HashMap<>());
        }
        HashMap<Symbol, Integer> rowMap = counts.get(row);
        if(!rowMap.containsKey(symbol)){
            rowMap.put(symbol, 0);
        }
        rowMap.put(symbol, rowMap.get(symbol) + 1);
        return rowMap.get(symbol) == board.getSize();
    }
}
