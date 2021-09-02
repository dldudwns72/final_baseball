package baseball;

import java.util.List;

public class Balls {

    private List<Ball> balls;

    public Balls(List<Ball> balls){
        ballsCountOver(balls.size());
        this.balls = balls;
    }

    public List<Ball> getBalls() {
        return balls;
    }

    private void ballsCountOver(int size){
        if(size != 3){
            throw new IllegalArgumentException("공의 자리수는 세자리수이여야 합니다.");
        }
    }
}
