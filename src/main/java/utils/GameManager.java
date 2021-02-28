package utils;

import java.util.*;

public class GameManager {

    private final String MESSAGE_INPUT = "input number : ";
    private String PRINT_SCORE;
    private final String MESSAGE_CONTINUE = "You got all 3 numbers correct! game set\nif you want to continue enter 1, to terminate enter 2";
    public Data data = new Data();

    public void printInput() {
        System.out.print(MESSAGE_INPUT);
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

    public void printScore() {
        PRINT_SCORE = "";

        if (data.getBall() != 0) {
            PRINT_SCORE += data.getBall() + "ball ";
        }

        if (data.getStrike() != 0) {
            PRINT_SCORE += data.getStrike() + "strike";
        }

        if (data.getStrike() == 0 && data.getBall() == 0) {
            PRINT_SCORE += "nothing";
        }

        System.out.println(PRINT_SCORE);
    }

    public void printGameSet() {
        System.out.println(MESSAGE_CONTINUE);
    }

    public void inputCmd(int cmd) {
        if (cmd != 1 && cmd != 2) {
            throw new IllegalArgumentException();
        }
        data.setCmd(cmd);
    }
}
