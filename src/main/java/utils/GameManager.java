package utils;

import java.util.*;

public class GameManager {
    public Data data = new Data();

    public void printInput() {
        System.out.print("input number : ");
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

    public void judge() {
        List<Integer> shot = data.getShot();
        List<Integer> target = data.getTarget();
        int ball = 0;
        int strike = 0;

        for (int i = 0; i < target.size(); i++) {
            for (int j = 0; j < shot.size(); j++) {
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
        String line = "";

        if (data.getBall() != 0) {
            line += data.getBall() + "ball ";
        }

        if (data.getStrike() != 0) {
            line += data.getStrike() + "strike";
        }

        if (data.getStrike() == 0 && data.getBall() == 0) {
            line += "nothing";
        }

        System.out.println(line);
    }

    public void printGameSet() {
        System.out.println("You got all 3 numbers correct! game set");
        System.out.println("if you want to continue enter 1, to terminate enter 2");
    }

    public void inputCmd(int cmd) {
        if (cmd != 1 && cmd != 2) {
            throw new IllegalArgumentException();
        }
        data.setCmd(cmd);
    }
}
