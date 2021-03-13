package View;

import baseball.Continue;
import utils.InputValidator;
import utils.TargetFactory;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Input {
    private static final Scanner scanner = new Scanner(System.in);

    public static List<Integer> inputShot() {
        return TargetFactory.generateShot(scanner.nextInt());
    }

    public static Continue inputCmd() {
        int cmd = scanner.nextInt();
        InputValidator.validateCmdInput(cmd);
        return Arrays.stream(Continue.values())
                .filter(e -> e.getValue() != cmd)
                .findFirst()
                .orElseThrow(() -> {throw new NoSuchElementException();});
    }
}