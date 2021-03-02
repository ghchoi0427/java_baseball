package View;

import utils.GameManager;

import java.util.ArrayList;
import java.util.List;

public class Input {

    GameManager gm;

    public Input(GameManager gm) {
        this.gm = gm;
    }

    public void inputShot(int input) {
        List<Integer> shot = new ArrayList<>();

        if ((int) (Math.log10(input) + 1) != 3) {
            throw new IllegalArgumentException();
        }

        shot.add(input / 100);
        shot.add((input / 10) % 10);
        shot.add(input % 10);

        gm.data.setShot(shot);
    }
}
