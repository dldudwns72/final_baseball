package baseball;

public class Ball {
    private int position;
    private int ball;

    public Ball(int position, int ball){
        rangeValidation(ball);
        this.position = position;
        this.ball = ball;
    }

    private void rangeValidation(int ball){
        if(ball < 0 || ball > 10){
            throw new RuntimeException();
        }
    }

    public int getPosition() {
        return position;
    }

    public int getBall() {
        return ball;
    }
}
