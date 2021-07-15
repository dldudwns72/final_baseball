package baseball;

import java.util.List;

public class Balls {
    private List<Ball> balls;

    public Balls(List<Ball> balls) {
        validate(balls);
        this.balls = balls;
    }

    private void validate(List<Ball> balls){
        for (int i = 0; i < balls.size(); i++) {

        }
    }

}
