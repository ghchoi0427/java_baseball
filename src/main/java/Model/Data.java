package Model;

import java.util.ArrayList;
import java.util.List;

public class Data {

    List<Integer> target = new ArrayList<>();
    List<Integer> shot = new ArrayList<>();
    int cmd;
    int ball;
    int strike;

    public int getBall() {
        return ball;
    }

    public void setBall(int ball) {
        this.ball = ball;
    }

    public int getStrike() {
        return strike;
    }

    public void setStrike(int strike) {
        this.strike = strike;
    }

    public List<Integer> getTarget() {
        return target;
    }

    public void setTarget(List<Integer> target) {
        this.target = target;
    }

    public List<Integer> getShot() {
        return shot;
    }

    public void setShot(List<Integer> shot) {
        this.shot = shot;
    }

    public int getCmd() {
        return cmd;
    }

    public void setCmd(int cmd) {
        this.cmd = cmd;
    }
}
