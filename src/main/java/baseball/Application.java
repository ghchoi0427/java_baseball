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
                gm.inputShot(scanner.nextInt());
                gm.clearScore();
                gm.judge();
                gm.printScore();
            } while (data.getStrike() != 3);
            gm.gameSet();
            gm.inputCmd(scanner.nextInt());
        } while (data.getCmd() != 2);
    }
}
