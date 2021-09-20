package baseball;

import java.util.Objects;

public class Ball {
    private static final int MIN_BALL = 1;
    private static final int MAX_BALL = 9;

    private int ball;
    private int position;

    public Ball(int position, int ball){
        rangeValidation(ball);
        this.ball = ball;
        this.position = position;
   }

    private void rangeValidation(int ball){
        if(ball < MIN_BALL  || ball > MAX_BALL)
        throw new BallException("공의 범위는 1이상 9이하 입니다.");
    }

    public int getBall() {
        return ball;
    }

    public int getPosition() {
        return position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball ball1 = (Ball) o;
        return ball == ball1.ball && position == ball1.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ball, position);
    }
}
