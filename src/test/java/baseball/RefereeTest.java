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
        userBalls = new Balls(Arrays.asList(new Ball(0,2),new Ball(1,5),new Ball(2,6)));

        Referee referee = new Referee(computerBalls,userBalls);

        String gameResult = referee.gameResult();

        assertThat(gameResult).isEqualTo("1BALL");
    }

    @Test
    @DisplayName("2볼")
    public void twoBall(){
        userBalls = new Balls(Arrays.asList(new Ball(0,2),new Ball(1,3),new Ball(2,8)));

        Referee referee = new Referee(computerBalls,userBalls);

        String gameResult = referee.gameResult();

        assertThat(gameResult).isEqualTo("2BALL");
    }

    @Test
    @DisplayName("1스트라이크 1볼")
    public void oneStrikeOneBall(){
        userBalls = new Balls(Arrays.asList(new Ball(0,9),new Ball(1,1),new Ball(2,3)));

        Referee referee = new Referee(computerBalls,userBalls);

        String gameResult = referee.gameResult();

        assertThat(gameResult).isEqualTo("1STRIKE1BALL");
    }
    @Test
    @DisplayName("3스트라이크")
    public void threeStrike(){
        userBalls = new Balls(Arrays.asList(new Ball(0,1),new Ball(1,2),new Ball(2,3)));

        Referee referee = new Referee(computerBalls,userBalls);

        String gameResult = referee.gameResult();

        assertThat(gameResult).isEqualTo("3STRIKE");
    }




}
