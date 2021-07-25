package baseball;

import java.util.ArrayList;
import java.util.List;

public class Balls {

    private List<Ball> userBalls;

    public Balls(List<Integer> answers){
        List<Ball> userBalls = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.print(answers.get(i));
            userBalls.add(new Ball(i+1, answers.get(i)));
        }

        this.userBalls = userBalls;
    }

    public List<Ball> getUserBalls() {
        return userBalls;
    }

}
