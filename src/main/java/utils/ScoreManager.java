package utils;

import java.util.List;

public class ScoreManager {

    GameManager gm;

    public ScoreManager(GameManager gm) {
        this.gm = gm;
    }

    public void setScore() {
        List<Integer> shot = gm.data.getShot();
        List<Integer> target = gm.data.getTarget();
        int ball = 0;
        int strike = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                ball += countBall(target.get(i), i, shot.get(j), j);
                strike += countStrike(target.get(i), i, shot.get(j), j);
            }
        }

        gm.data.setBall(ball);
        gm.data.setStrike(strike);
    }

    public int countBall(int target, int targetIdx, int shot, int shotIdx) {
        if (targetIdx != shotIdx && target == shot) {
            return 1;
        }
        return 0;
    }

    public int countStrike(int target, int targetIdx, int shot, int shotIdx) {
        if (targetIdx == shotIdx && target == shot) {
            return 1;
        }
        return 0;
    }

    public void clearScore() {
        gm.data.setBall(0);
        gm.data.setStrike(0);
    }
}
