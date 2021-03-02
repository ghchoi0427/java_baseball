package utils;

import java.util.*;

public class GameManager {

    public Data data = new Data();

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


}
