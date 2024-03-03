package TicTacToe.Model;

import java.util.ArrayList;
import java.util.List;

public class Board {
    List<List<Cell>> board;
    int size;

    public Board(int size) {
        this.size = size;
        board = new ArrayList<>();
        for(int i = 0; i < size; i++){
            List<Cell> row = new ArrayList<>();
            for(int j = 0; j < size; j++){
                row.add(new Cell(i, j));
            }
            board.add(row);
        }
    }

    public List<List<Cell>> getBoard() {
        return board;
    }

    public void setBoard(List<List<Cell>> board) {
        this.board = board;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void printBoard(){
        for(List<Cell> row: board){
            for(Cell cell: row){
                cell.print();
            }
            System.out.println();
        }
    }
}
