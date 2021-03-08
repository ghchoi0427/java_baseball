package View;

import utils.InputValidator;
import utils.TargetFactory;
import java.util.List;
import java.util.Scanner;

public class Input {
    private static final Scanner scanner = new Scanner(System.in);

    public static List<Integer> inputShot() {
        return TargetFactory.generateShot(scanner.nextInt());
    }

    public static int inputCmd() {
        int cmd = scanner.nextInt();
        InputValidator.validateCmdInput(cmd);
        return cmd;
    }
}
