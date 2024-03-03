package TicTacToe.Strategy.BotPlayingStrategies;

import TicTacToe.Model.Board;
import TicTacToe.Model.Cell;
import TicTacToe.Model.CellState;
import TicTacToe.Model.Move;

import java.util.List;

public class EasyBotPlayingStrategy implements BotPlayingStrategy{
    @Override
    public Move makeMove(Board board) {
        for(List<Cell> row: board.getBoard()){
            for(Cell cell: row){
                if(cell.getCellState().equals(CellState.EMPTY)){
                    return new Move(cell);
                }
            }
        }
        return null;
    }
}
