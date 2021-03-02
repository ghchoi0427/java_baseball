package utils;

public class InputValidator {

    public void validateShotInput(int input) throws IllegalArgumentException {

        if ((int) (Math.log10(input) + 1) != 3) {
            throw new IllegalArgumentException();
        }

        if (input < 0) {
            throw new IllegalArgumentException();
        }
    }

    public void validateCmdInput() throws IllegalArgumentException {

    }
}
