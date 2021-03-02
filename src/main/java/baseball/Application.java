package baseball;

import View.Input;
import View.Output;
import utils.GameManager;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        // TODO 구현 진행
        GameManager gm = new GameManager();
        Input input = new Input(gm);
        Output output = new Output(gm);

        do {
            gm.generateTarget();
            do {
                output.printInput();
                input.inputShot(scanner.nextInt());
                gm.clearScore();
                gm.setScore();
                output.printScore();
            } while (gm.data.getStrike() != 3);
            output.printGameSet();
            input.inputCmd(scanner.nextInt());
        } while (gm.data.getCmd() != 2);
    }
}
