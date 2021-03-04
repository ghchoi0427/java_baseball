package utils;

import java.util.List;
import java.util.stream.Stream;

public class InputValidator {

    final String Msg_zeroInput = "input shouldn't include zero";
    final String Msg_illegalLength = "input length should be three";
    final String Msg_overlap = "all three numbers should be distinct";
    final String Msg_illegalCommand = "command should be 1 or 2";

    public void validateShotInput(List<Integer> input) throws IllegalArgumentException {
        Stream<Integer> inputStream1 = input.stream();
        Stream<Integer> inputStream2 = input.stream();
        Stream<Integer> inputStream3 = input.stream();
        Stream<Integer> inputStream4 = input.stream();

        if (inputStream1.anyMatch(n -> n == 0)) {
            throw new IllegalArgumentException(Msg_zeroInput);
        }

        if (inputStream2.mapToLong(e -> 1L).sum() != 3) {
            throw new IllegalArgumentException(Msg_illegalLength);
        }

        if (inputStream3.count() != inputStream4.distinct().count()) {
            throw new IllegalArgumentException(Msg_overlap);
        }
    }

    public void validateCmdInput(int cmd) throws IllegalArgumentException {
        if (cmd != 1 && cmd != 2) {
            throw new IllegalArgumentException(Msg_illegalCommand);
        }
    }
}
