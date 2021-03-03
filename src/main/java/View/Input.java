package View;

import utils.GameManager;
import utils.InputValidator;
import utils.TargetShotFactory;

public class Input {

    GameManager gm;
    InputValidator inputValidator= new InputValidator();
    public Input(GameManager gm) {
        this.gm = gm;
    }

    public void inputShot(int input) {

        inputValidator.validateShotInput(input);
        new TargetShotFactory(gm).generateShot(input);
    }

    public void inputCmd(int cmd) {
        inputValidator.validateCmdInput(cmd);
        gm.data.setCmd(cmd);
    }
}
