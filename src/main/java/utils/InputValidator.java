package utils;

import java.util.List;

public class InputValidator {

    private static final String Msg_zeroInput = "input shouldn't include zero";
    private static final String Msg_illegalLength = "input length should be three";
    private static final String Msg_overlap = "all three numbers should be distinct";
    private static final String Msg_illegalCommand = "command should be 1 or 2";

    public static void validateShotInput(List<Integer> input) throws IllegalArgumentException {

        if (input.stream().anyMatch(n -> n == 0)) {
            throw new IllegalArgumentException(Msg_zeroInput);
        }

        if (input.stream().count() != 3) {
            throw new IllegalArgumentException(Msg_illegalLength);
        }

        if (input.stream().count() != input.stream().distinct().count()) {
            throw new IllegalArgumentException(Msg_overlap);
        }
    }

    public static void validateCmdInput(int cmd) throws IllegalArgumentException {
        if (cmd != 1 && cmd != 2) {
            throw new IllegalArgumentException(Msg_illegalCommand);
        }
    }
}
