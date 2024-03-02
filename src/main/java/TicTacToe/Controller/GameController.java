package TicTacToe.Controller;

import TicTacToe.Model.Board;
import TicTacToe.Model.Game;
import TicTacToe.Model.GameState;
import TicTacToe.Model.Player;
import TicTacToe.Strategy.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class GameController {

    public Game startGame(int dimension,
                          List<Player> players,
                          List<WinningStrategy> winningStrategies){
//        return new Game(0, new ArrayList<>(), new ArrayList<>());
        return Game.CreateBuilder()
                .setDimension(dimension)
                .setPlayers(players)
                .setWinningStrategies(winningStrategies)
                .build();
    }
    public void makeMove(Game game){

    }

    public void displayBoard(Game game){
        game.getBoard().printBoard();
    }

    public Player getWinner(Game game){
        return null;
    }

    public GameState checkGameState(Game game){
        return GameState.IN_PROCESS;
    }
}


// Client -> GameController -> service/models
// 1. Start the game
// 2. While game is in Progress
    // 2.1 Make the move
    // 2.2 Display the board
// 3. Display the result
    //3.1 if it win game then Display winners name
    //3.2 If its draw then show game draw
// 4. Undo the Moves
