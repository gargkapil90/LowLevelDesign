package TicTacToe.Model;

import java.util.List;

public class Board {
    List<List<Cell>> cells;
    int size;

    public Board(int size) {
        this.size = size;
    }

    public List<List<Cell>> getCells() {
        return cells;
    }

    public void setCells(List<List<Cell>> cells) {
        this.cells = cells;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void printBoard(){

    }
}
