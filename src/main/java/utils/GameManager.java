package utils;

import java.util.*;

public class GameManager {

    public Data data = new Data();

    public void generateTarget() {
        List<Integer> target = new ArrayList<>();
        int temp;

        target.add(RandomUtils.nextInt(1, 9));

        for (int i = 0; i < 2; i++) {
            do {
                temp = RandomUtils.nextInt(1, 9);
            } while (target.contains(temp));
            target.add(temp);
        }

        data.setTarget(target);
    }

    public void inputShot(int input) {
        List<Integer> shot = new ArrayList<>();

        if ((int) (Math.log10(input) + 1) != 3) {
            throw new IllegalArgumentException();
        }

        shot.add(input / 100);
        shot.add((input / 10) % 10);
        shot.add(input % 10);

        data.setShot(shot);
    }
}
