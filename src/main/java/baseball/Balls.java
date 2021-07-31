package baseball;

import java.util.ArrayList;
import java.util.List;

public class Balls {

    private List<Ball> answers;

    public Balls(List<Integer> answers) {

        List<Ball> userBalls = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            userBalls.add(new Ball(i + 1, answers.get(i)));
        }

        this.answers = userBalls;
    }


    public BallStatus play(Ball ball) {
        return answers.stream()
                .map(answer -> answer.play(ball.getPosition(), ball.getBallNo()))
                .filter(BallStatus::isNotNothing) // status -> status.isNotNothing() 과 동일
                .findFirst() // findFirst 스트림의 순서상 가장 첫번째 있는 것을 리턴해주고, findAny는 순서와 관계없이 먼저 찾아지는 객체를 리턴
                .orElse(BallStatus.NOTHING); // 위에서 Nothing이 아닌것은 다 걸렀다 그 경우 값이 없다면 Nothing 호출

    }

    public List<Ball> getAnswers() {
        return answers;
    }
}
