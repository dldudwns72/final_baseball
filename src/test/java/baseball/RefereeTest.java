package baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class RefereeTest {

    private Balls computerBalls;
    private Balls userBalls;

    @BeforeEach
    public void setUp(){
        computerBalls = new Balls(Arrays.asList(new Ball(0,1),new Ball(1,2),new Ball(2,3)));
    }

    @Test
    @DisplayName("1볼")
    public void oneBall(){
        userBalls = new Balls(Arrays.asList(new Ball(0,2),new Ball(1,6),new Ball(2,4)));

        Referee referee = new Referee(computerBalls,userBalls);

        String gameResult = referee.gameResult();

        assertThat(gameResult).isEqualTo("1BALL");

    }



}
