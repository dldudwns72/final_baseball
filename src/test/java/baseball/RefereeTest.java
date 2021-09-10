package baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ui.InputView;

import java.util.ArrayList;
import java.util.List;

public class RefereeTest {

    private Balls computerBalls;
    @BeforeEach
    public void setUp(){
        List<Ball> computerBallList = new ArrayList<>();

        computerBallList.add(new Ball(0,1));
        computerBallList.add(new Ball(1,4));
        computerBallList.add(new Ball(2,5));

        computerBalls = new Balls(computerBallList);
    }


    @Test
    @DisplayName("1볼 1스트라이크")
    public void oneBallTwoStrike(){
        List<Ball> userBallList = new ArrayList<>();
        userBallList.add(new Ball(0,1));
        userBallList.add(new Ball(1,6));
        userBallList.add(new Ball(2,5));

        Balls userBalls = new Balls(userBallList);

        Referee referee = new Referee(computerBalls,userBalls);

    }

}
