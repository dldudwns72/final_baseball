package baseball;

import java.util.ArrayList;
import java.util.List;

public class Balls {

    private List<Ball> answers;

    public Balls(List<Integer> answers){
        List<Ball> userBalls = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            userBalls.add(new Ball(i+1, answers.get(i)));
        }

        this.answers = userBalls;
    }


    public BallStatus play(Ball ball) {
        return answers.stream()
                .map(answer -> answer.play(ball.getPosition(), ball.getBallNo()))
                .filter(BallStatus::isNotNothing) // status -> status.isNotNothing() 과 동일
                .findFirst()
                .orElse(BallStatus.NOTHING);

    }
}
