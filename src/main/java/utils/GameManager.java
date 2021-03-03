package utils;

import View.Input;
import View.Output;

import java.util.*;

public class GameManager {

    public Data data = new Data();
    Input input = new Input(this);
    Output output = new Output(this);
    ScoreManager sm = new ScoreManager(this);
    TargetShotFactory targetShotFactory = new TargetShotFactory(this);


    public void startGame(Scanner scanner){
        do {
            targetShotFactory.generateTarget();
            do {
                startInning(scanner);
            } while (data.getStrike() != 3);
            output.printGameSet();
            input.inputCmd(scanner.nextInt());
        } while (data.getCmd() != 2);
    }

    public void startInning(Scanner scanner){
        output.printInput();
        input.inputShot(scanner.nextInt());
        sm.clearScore();
        sm.setScore();
        output.printScore();
    }


}
