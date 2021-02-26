package utils;

import java.util.ArrayList;
import java.util.List;

public class Data {

    List<Integer> target = new ArrayList<>();
    List<Integer> shot = new ArrayList<>();
    int cmd = 0;

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
