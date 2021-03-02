package utils;

import java.util.List;

public class ScoreManager {

    GameManager gm = new GameManager();
    public void setScore() {
        List<Integer> shot = gm.data.getShot();
        List<Integer> target = gm.data.getTarget();
        int ball = 0;
        int strike = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                ball += gm.countBall(target.get(i), i, shot.get(j), j);
                strike += gm.countStrike(target.get(i), i, shot.get(j), j);
            }
        }

        gm.data.setBall(ball);
        gm.data.setStrike(strike);
    }
}
