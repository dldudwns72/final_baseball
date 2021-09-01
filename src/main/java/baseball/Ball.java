package baseball;

public class Ball {
    private static final int MIN_BALL = 1;
    private static final int MAX_BALL = 9;

    private int ball;

    public Ball(int ball){
        rangeValidation(ball);
        this.ball = ball;
    }

    private void rangeValidation(int ball){
        if(ball < MIN_BALL  || ball > MAX_BALL)
        throw new BallException("공의 범위는 1이상 9이하 입니다.");
    }

    public int getBall() {
        return ball;
    }

}
