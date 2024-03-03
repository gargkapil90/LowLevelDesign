package TicTacToe.Strategy.WinningStrategies;

import TicTacToe.Model.Board;
import TicTacToe.Model.Move;
import TicTacToe.Model.Player;
import TicTacToe.Model.Symbol;

import java.util.HashMap;

public class ColWinningStrategy implements WinningStrategy{

    private HashMap<Integer, HashMap<Symbol, Integer>> counts = new HashMap<>();
    @Override
    public boolean checkWinner(Move move, Board board) {
        int col = move.getMove().getCol();
        Symbol symbol = move.getMove().getPlayer().getSymbol();
        if(!counts.containsKey(col)){
            counts.put(col, new HashMap<>());
        }
        HashMap<Symbol, Integer> colMap = counts.get(col);
        if(!colMap.containsKey(symbol)){
            colMap.put(symbol, 0);
        }
        colMap.put(symbol, colMap.get(symbol) + 1);
        return colMap.get(symbol) == board.getSize();
    }
}
