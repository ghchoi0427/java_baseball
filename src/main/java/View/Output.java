package View;

import utils.GameManager;

public class Output {

    private final String MESSAGE_INPUT = "input number : ";
    private String PRINT_SCORE;
    private final String MESSAGE_CONTINUE = "You got all 3 numbers correct! game set\nif you want to continue enter 1, to terminate enter 2";

    GameManager gm;

    public Output(GameManager gm) {
        this.gm = gm;
    }

    public void printInput() {
        System.out.print(MESSAGE_INPUT);
    }

    public void printScore() {
        PRINT_SCORE = "";

        if (gm.data.getBall() != 0) {
            PRINT_SCORE += gm.data.getBall() + "ball ";
        }

        if (gm.data.getStrike() != 0) {
            PRINT_SCORE += gm.data.getStrike() + "strike";
        }

        if (gm.data.getStrike() == 0 && gm.data.getBall() == 0) {
            PRINT_SCORE += "nothing";
        }

        System.out.println(PRINT_SCORE);
    }

    public void printGameSet() {
        System.out.println(MESSAGE_CONTINUE);
    }

}
