package utils;

import java.util.ArrayList;
import java.util.List;

public class TargetFactory {

    public static List<Integer> generateTarget() {
        return distinctNums();
    }

    public static List<Integer> distinctNums(){
        List<Integer> target = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            int temp;
            do {
                temp = RandomUtils.nextInt(1, 9);
            } while (target.contains(temp));
            target.add(temp);
        }
        return target;
    }

    public static List<Integer> generateShot(int input){
        List<Integer> shot = intToList(input);
        InputValidator.validateShotInput(shot);
        return shot;
    }

    public static List<Integer> intToList(int input){
        List<Integer> output = new ArrayList<>();
        output.add(input / 100);
        output.add((input / 10) % 10);
        output.add(input % 10);

        return output;
    }
}
