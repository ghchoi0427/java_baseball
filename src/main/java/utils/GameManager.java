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


    public void setScore() {
        List<Integer> shot = data.getShot();
        List<Integer> target = data.getTarget();
        int ball = 0;
        int strike = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                ball += countBall(target.get(i), i, shot.get(j), j);
                strike += countStrike(target.get(i), i, shot.get(j), j);
            }
        }

        data.setBall(ball);
        data.setStrike(strike);
    }

    int countBall(int target, int targetIdx, int shot, int shotIdx) {
        if (targetIdx != shotIdx && target == shot) {
            return 1;
        }
        return 0;
    }

    int countStrike(int target, int targetIdx, int shot, int shotIdx) {
        if (targetIdx == shotIdx && target == shot) {
            return 1;
        }
        return 0;
    }

    public void clearScore() {
        data.setBall(0);
        data.setStrike(0);
    }


}
