package utils;

import java.util.ArrayList;
import java.util.List;

public class TargetShotFactory {

    GameManager gm;

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
        List<Integer> shot = new ArrayList<>();
        shot.add(input / 100);
        shot.add((input / 10) % 10);
        shot.add(input % 10);
        gm.data.setShot(shot);
    }
}
