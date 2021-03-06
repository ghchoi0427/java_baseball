package Model;

public class ScoreDto {
    private int ball;
    private int strike;

    public ScoreDto(int ball, int strike){
        this.ball = ball;
        this.strike = strike;
    }

    public int getBall() {
        return ball;
    }

    public int getStrike() {
        return strike;
    }

    public boolean isAllCorrect(){
        return strike == 3;
    }
}
