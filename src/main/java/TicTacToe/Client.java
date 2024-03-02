package TicTacToe;

import TicTacToe.Controller.GameController;
import TicTacToe.Model.Game;
import TicTacToe.Model.GameState;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        GameController gameController = new GameController();

        Game game = gameController.startGame(3, new ArrayList<>(), new ArrayList<>());
        while (gameController.checkGameState(game).equals(GameState.IN_PROCESS)){
            gameController.makeMove(game);
            gameController.displayBoard(game);
        }
        if(gameController.checkGameState(game).equals(GameState.DRAW)){

        }
        if(gameController.checkGameState(game) == GameState.WIN){
            System.out.println(gameController.getWinner(game).getName());
        }
    }
}
