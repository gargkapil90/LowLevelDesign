package TicTacToe.Model;

public class Move {
    Cell move;

    public Move(Cell move) {
        this.move = move;
    }

    public Cell getMove() {
        return move;
    }

    public void setMove(Cell move) {
        this.move = move;
    }
}
