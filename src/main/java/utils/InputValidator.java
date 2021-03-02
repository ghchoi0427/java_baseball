package utils;

public class InputValidator {

    public void validateShotInput(int input) throws IllegalArgumentException {

        if ((int) (Math.log10(input) + 1) != 3) {
            throw new IllegalArgumentException("input length should be 3");
        }

        if (input < 0) {
            throw new IllegalArgumentException("input can't be below zero");
        }
    }

    public void validateCmdInput(int cmd) throws IllegalArgumentException {
        if (cmd != 1 && cmd != 2) {
            throw new IllegalArgumentException("command input should be 1 or 2");
        }
    }
}
