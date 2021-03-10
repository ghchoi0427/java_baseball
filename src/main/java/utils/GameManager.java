package utils;

import Model.ScoreDto;
import View.*;
import baseball.Continue;

import java.util.*;

public class GameManager {

    private boolean isGameEnd = false;

    public void startGame() {
        do {
            guessTarget(TargetFactory.generateTarget());
            Output.printGameSet();
        } while (Input.inputCmd() != Continue.TERMINATE);
    }

    private void guessTarget(List<Integer> target) {
        do {
            Output.printInput();
            ScoreDto score = ScoreManager.countScore(inputShot(), target);
            Output.printScore(score);
            setGameEnd(score);
        } while (!isGameEnd);
    }

    private void setGameEnd(ScoreDto score) {
        isGameEnd = score.isAllCorrect();
    }

    private List<Integer> inputShot() {
        return Input.inputShot();
    }
}
