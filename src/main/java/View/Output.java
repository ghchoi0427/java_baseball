package View;

import Model.ScoreDto;

public class Output {

    private static final String MESSAGE_INPUT = "input number : ";
    private static String PRINT_SCORE;
    private static final String MESSAGE_CONTINUE = "You got all 3 numbers correct! game set\nif you want to continue enter 1, to terminate enter 2";

    public static void printInput() {
        System.out.print(MESSAGE_INPUT);
    }

    public static void printScore(ScoreDto score) {
        PRINT_SCORE = "";

        if (score.getBall() != 0) {
            PRINT_SCORE += score.getBall() + "ball ";
        }

        if (score.getStrike() != 0) {
            PRINT_SCORE += score.getStrike() + "strike";
        }

        if (score.getStrike() == 0 && score.getBall() == 0) {
            PRINT_SCORE += "nothing";
        }

        System.out.println(PRINT_SCORE);
    }

    public static void printGameSet() {
        System.out.println(MESSAGE_CONTINUE);
    }

}
