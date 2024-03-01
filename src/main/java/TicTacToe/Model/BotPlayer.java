package TicTacToe.Model;

public class BotPlayer extends Player{
    DifficultyLevel difficultyLevel;

    public DifficultyLevel getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(DifficultyLevel difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }
}
