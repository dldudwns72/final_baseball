package baseball;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Referee {

    private Balls computerBalls;
    private Balls userBalls;

    public Referee(Balls computerBalls, Balls userBalls) {
        this.computerBalls = computerBalls;
        this.userBalls = userBalls;
    }

    public String gameResult() {
        List<String> resultList = new ArrayList<>();

        for (int i = 0; i < computerBalls.getBalls().size(); i++) {
            Ball computerBall = computerBalls.getBalls().get(i);

        }

        return null;
    }



}
