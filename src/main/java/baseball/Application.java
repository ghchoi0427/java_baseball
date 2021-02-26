package baseball;

import utils.Data;
import utils.GameManager;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        // TODO 구현 진행
        GameManager gm = new GameManager();
        Data data = gm.data;
        do {
            gm.generateTarget();

            do {
                System.out.print("input number : ");
                int input = scanner.nextInt();
                gm.inputShot(input);
                gm.clearScore();
                gm.judge();
                gm.printScore();
            } while (data.getStrike() != 3);
                gm.gameSet();
                int cmd = scanner.nextInt();
                gm.inputCmd(cmd);

        } while (data.getCmd() != 2);
    }
}
