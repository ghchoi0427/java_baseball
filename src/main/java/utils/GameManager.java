package utils;

import View.Input;
import View.Output;

import java.util.*;

public class GameManager {

    public Data data = new Data();
    Input input = new Input(this);
    Output output = new Output(this);
    ScoreManager sm = new ScoreManager(this);

    public void generateTarget() {
        List<Integer> target = new ArrayList<>();
        int temp;

        for (int i = 0; i < 3; i++) {
            do {
                temp = RandomUtils.nextInt(1, 9);
            } while (target.contains(temp));
            target.add(temp);
        }
        data.setTarget(target);
    }

    public void startGame(Scanner scanner){
        do {
            generateTarget();
            do {
                output.printInput();
                input.inputShot(scanner.nextInt());
                sm.clearScore();
                sm.setScore();
                output.printScore();
            } while (data.getStrike() != 3);
            output.printGameSet();
            input.inputCmd(scanner.nextInt());
        } while (data.getCmd() != 2);
    }


}
