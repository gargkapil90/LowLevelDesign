package TicTacToe.Model;

import TicTacToe.Strategy.WinningStrategy;

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
}
