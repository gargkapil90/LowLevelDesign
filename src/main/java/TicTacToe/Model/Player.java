package TicTacToe.Model;

import java.util.Scanner;

public class Player {
    int id;
    String name;
    Symbol symbol;
    PlayerType playerType;

    Scanner sc;

    public Player(int id, String name, Symbol symbol, PlayerType playerType) {
        this.id = id;
        this.name = name;
        this.symbol = symbol;
        this.playerType = playerType;
        sc = new Scanner(System.in);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }

    public Move makeMove(Board board){
        System.out.println("Please mention the row in which you want to move");
        int row = sc.nextInt();
        System.out.println("Please mention the col in which you want to move");
        int col = sc.nextInt();
        return new Move(new Cell(row, col));
    }
}
