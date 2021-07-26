package baseball;

public class Ball {

    private int position;
    private int ballNo;

    private static final int MIN_BALLNO = 1;
    private static final int MAX_BALLNO = 9;
    private static final String INVALID_BALL_RANGE_MESSAGE = "공 숫자의 범위를 벗어났습니다.";

    public Ball(int position, int ballNo) {
        isValid(ballNo);
        this.position = position;
        this.ballNo = ballNo;
    }

    private void isValid(int ballNo){
        if(ballNo < MIN_BALLNO || ballNo > MAX_BALLNO){
//            throw new IllegalArgumentException(INVALID_BALL_RANGE_MESSAGE);
            throw new InvalidBallRangeException(INVALID_BALL_RANGE_MESSAGE);
        }
    }

    public BallStatus play(int position, int ballNo){
        if(position == this.position && ballNo == this.ballNo){
            return BallStatus.STRIKE;
        }

        if(isMatchBall(position,ballNo)){
            return BallStatus.BALL;
        }

        return BallStatus.NOTHING;
    }

    private boolean isMatchBall(int position, int ballNo) {
        if (position != this.position && ballNo == this.ballNo) {
            return true;
        }
        return false;
    }

    public int getPosition() {
        return position;
    }

    public int getBallNo() {
        return ballNo;
    }
}
