package utils;

import Model.ScoreDto;
import java.util.List;
import java.util.stream.IntStream;

public class ScoreManager {

    public static int countBall(List<Integer> shot, List<Integer> target) {
        int sum = 0;


        sum = (int) IntStream.range(0, shot.size())
                .filter(index -> isContainsDifferentPosition(target, shot.get(index), index))
                .count();

        return sum;
    }

    private static boolean isContainsDifferentPosition(List<Integer> target, int number, int index) {
        return target.contains(number) && target.get(index) != number;
    }


    public static int countStrike(List<Integer> shot, List<Integer> target) {
        int sum = 0;

        sum = (int) IntStream.range(0, shot.size())
                .filter(index -> shot.get(index) == target.get(index))
                .count();

        return sum;
    }

    public static ScoreDto countScore(List<Integer> shot, List<Integer> target) {
        return new ScoreDto(countBall(shot, target), countStrike(shot, target));
    }
}
