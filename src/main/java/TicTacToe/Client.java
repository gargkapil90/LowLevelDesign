package TicTacToe;

import TicTacToe.Controller.GameController;
import TicTacToe.Model.*;
import TicTacToe.Strategy.WinningStrategies.ColWinningStrategy;
import TicTacToe.Strategy.WinningStrategies.RowWinningStrategy;
import TicTacToe.Strategy.WinningStrategies.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        GameController gameController = new GameController();
        System.out.println("Let start tic-tac-toe game");

        int dimension = 3;
        List<Player> players = new ArrayList<>();
        players.add(new Player(1, "KK", new Symbol('X'), PlayerType.HUMAN));
        players.add(new BotPlayer(2, "GPT", new Symbol('0'), DifficultyLevel.EASY));

        List<WinningStrategy> winningStrategies = new ArrayList<>();
        winningStrategies.add(new RowWinningStrategy());
        winningStrategies.add(new ColWinningStrategy());

        Game game = gameController.startGame(dimension, players, winningStrategies);
        gameController.displayBoard(game);
        while (gameController.checkGameState(game).equals(GameState.IN_PROCESS)){
            gameController.makeMove(game);
            gameController.displayBoard(game);
        }
        if(gameController.checkGameState(game).equals(GameState.DRAW)){

        }
        if(gameController.checkGameState(game) == GameState.WIN){
            System.out.print("Winner is: ");
            System.out.println(gameController.getWinner(game).getName());
        }
    }
}
