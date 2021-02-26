package utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GameManager {

    Data data = new Data();
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


}
