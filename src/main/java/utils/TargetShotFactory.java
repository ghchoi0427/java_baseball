package utils;

import java.util.ArrayList;
import java.util.List;

public class TargetShotFactory {

    GameManager gm;
    InputValidator inputValidator = new InputValidator();

    public TargetShotFactory(GameManager gm) {
        this.gm = gm;
    }

    public void generateTarget() {
        List<Integer> target = new ArrayList<>();
        int temp;

        for (int i = 0; i < 3; i++) {
            do {
                temp = RandomUtils.nextInt(1, 9);
            } while (target.contains(temp));
            target.add(temp);
        }
        gm.data.setTarget(target);
    }

    public void generateShot(int input){
        List<Integer> shot = intToList(input);
        inputValidator.validateShotInput(shot);
        gm.data.setShot(shot);
    }

    public List<Integer> intToList(int input){
        List<Integer> output = new ArrayList<>();
        output.add(input / 100);
        output.add((input / 10) % 10);
        output.add(input % 10);

        return output;
    }
}
