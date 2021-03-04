package utils;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class InputValidator {

    public void validateShotInput(int input) throws IllegalArgumentException {

        if ((int) (Math.log10(input) + 1) != 3) {
            throw new IllegalArgumentException("input length should be 3");
        }

        if (input < 0) {
            throw new IllegalArgumentException("input can't be below zero");
        }
    }

    public void validateShotInput(List<Integer> input) throws IllegalArgumentException {
        Stream<Integer> inputStream1 = input.stream();
        Stream<Integer> inputStream2 = input.stream();
        Stream<Integer> inputStream3 = input.stream();
        Stream<Integer> inputStream4 = input.stream();

        if (inputStream1.anyMatch(n -> n == 0)) {
            throw new IllegalArgumentException("input shouldn't include zero");
        }

        if (inputStream2.mapToLong(e->1L).sum() != 3) {
            throw new IllegalArgumentException("input length should be three");
        }

        if (inputStream3.count() != inputStream4.distinct().count()) {
            throw new IllegalArgumentException("cannot include overlapped numbers");
        }
    }

    public void validateCmdInput(int cmd) throws IllegalArgumentException {
        if (cmd != 1 && cmd != 2) {
            throw new IllegalArgumentException("command input should be 1 or 2");
        }
    }
}
