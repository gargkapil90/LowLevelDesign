package TicTacToe.Model;

import TicTacToe.Strategy.WinningStrategies.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Game {
    Board board;
    List<Player> players;
    GameState gameState;
    Player winner;
    List<Move> moves;
    int nextPlayerIndex;
    List<WinningStrategy> winningStrategies;

    private Game(int dimension,
                List<Player> players,
                List<WinningStrategy> winningStrategies) {
        this.board = new Board(dimension);
        this.players = players;
        this.winningStrategies = winningStrategies;
        this.gameState = GameState.IN_PROCESS;
        this.winner = null;
        this.nextPlayerIndex = 0;
        this.moves = new ArrayList<>();
    }

    public static Builder CreateBuilder(){
        return new Builder();
    }

    public static class Builder{
        int dimension;
        List<Player> players;

        List<WinningStrategy> winningStrategies;

        public Builder setDimension(int dimension) {
            this.dimension = dimension;
            return this;
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public Builder setWinningStrategies(List<WinningStrategy> winningStrategies) {
            this.winningStrategies = winningStrategies;
            return this;
        }
        public Game build(){
            //validate the input before creating game object
            return new Game(this.dimension, this.players, this.winningStrategies);
        }
    }

    public List<WinningStrategy> getWinningStrategies() {
        return winningStrategies;
    }

    public void setWinningStrategies(List<WinningStrategy> winningStrategies) {
        this.winningStrategies = winningStrategies;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public int getNextPlayerIndex() {
        return nextPlayerIndex;
    }

    public void setNextPlayerIndex(int nextPlayerIndex) {
        this.nextPlayerIndex = nextPlayerIndex;
    }

    public void printBoard(){
        board.printBoard();
    }

    public boolean validateMove(Move move){
        Cell cell = move.getMove();
        int row = cell.getRow();
        int col = cell.getCol();
        if(cell.getRow() < 0 || cell.getRow() >= board.size){
            return false;
        }
        if(cell.getCol() < 0 || cell.getCol() >= board.size){
            return false;
        }
        return board.getBoard().get(row).get(col).getCellState().equals(CellState.EMPTY);
    }
    public Move makeMove(){
        Player currentPlayer = players.get(nextPlayerIndex);
        System.out.println("It is " + currentPlayer.getName()+ "'s turn. Please make a move");
        Move move = currentPlayer.makeMove(board);
        if(!validateMove(move)){
            System.out.println("Invalid move. Please try again!!");
            return null;
        }
        int row = move.getMove().getRow();
        int col = move.getMove().getCol();
        Cell cellToBeUpdated = board.getBoard().get(row).get(col);
        cellToBeUpdated.setCellState(CellState.FILLED);
        cellToBeUpdated.setPlayer(currentPlayer);
        move.setMove(cellToBeUpdated);
        moves.add(new Move(cellToBeUpdated));
        nextPlayerIndex += 1;
        nextPlayerIndex %= players.size();
        if(checkWinner(board, move)){
            setGameState(GameState.WIN);
            winner = currentPlayer;
        }else if(moves.size() == board.getSize()*board.getSize()){
            gameState = GameState.DRAW;
        }
        return move;
    }

    public boolean checkWinner(Board board, Move move){
        for(WinningStrategy winningStrategy: winningStrategies){
            if(winningStrategy.checkWinner(move, board)){
                return true;
            }
        }
        return false;
    }
}
