package utils;

import Model.Data;
import View.*;
import java.util.*;

public class GameManager {

    public Data data = new Data();
    Input input = new Input(this);
    Output output = new Output(this);
    ScoreManager sm = new ScoreManager(this);
    TargetShotFactory targetShotFactory = new TargetShotFactory(this);

    public void startGame(Scanner scanner) {
        do {
            targetShotFactory.generateTarget();
            startInning(scanner, data);
            output.printGameSet();
            input.inputCmd(scanner.nextInt());
        } while (data.getCmd() != 2);
    }

    public void startInning(Scanner scanner, Data data) {

        while (data.getStrike() != 3) {
            output.printInput();
            input.inputShot(scanner.nextInt());
            sm.clearScore();
            sm.setScore();
            output.printScore();
        }
    }
}
