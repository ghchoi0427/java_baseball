package baseball;

import View.Input;
import utils.Data;
import utils.GameManager;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        // TODO 구현 진행
        GameManager gm = new GameManager();
        Input input = new Input(gm);

        do {
            gm.generateTarget();
            do {
                gm.printInput();
                input.inputShot(scanner.nextInt());
                gm.clearScore();
                gm.setScore();
                gm.printScore();
            } while (gm.data.getStrike() != 3);
            gm.printGameSet();
            gm.inputCmd(scanner.nextInt());
        } while (gm.data.getCmd() != 2);
    }
}
