package baseball;

import View.Input;
import View.Output;
import utils.GameManager;
import utils.ScoreManager;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        // TODO 구현 진행
        GameManager gm = new GameManager();
        gm.startGame(scanner);


    }
}
