package View;

import utils.GameManager;
import utils.InputValidator;

import java.util.ArrayList;
import java.util.List;

public class Input {

    GameManager gm;
    InputValidator inputValidator= new InputValidator();

    public Input(GameManager gm) {
        this.gm = gm;
    }

    public void inputShot(int input) {
        List<Integer> shot = new ArrayList<>();

        inputValidator.validateShotInput(input);
        shot.add(input / 100);
        shot.add((input / 10) % 10);
        shot.add(input % 10);

        gm.data.setShot(shot);
    }

    public void inputCmd(int cmd) {
        inputValidator.validateCmdInput(cmd);
        gm.data.setCmd(cmd);
    }
}
