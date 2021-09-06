package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class BallTest {

    @Test
    @DisplayName("공 생성")
    public void generateBall(){
        Ball ball = new Ball(0, 1);
        assertThat(ball.getBall()).isEqualTo(1);
    }

    @Test
    @DisplayName("범위를 벗어난 공 생성 실패")
    public void rangeBallValidation(){
        assertThatThrownBy(()->{
            Ball ball1 = new Ball(0,0);
            Ball ball2 = new Ball(1,10);
        })
        .isInstanceOf(BallException.class)
        .hasMessage("공의 범위는 1이상 9이하 입니다.");
    }

//    @Test
//    @DisplayName("세자리를 넘긴 공 생성 실패")
//    public void rangePositionValidation(){
//        assertThatThrownBy(()->{
//            Ball ball1 = new Ball(3,0);
//        }).isInstanceOf(PositionException.class)
//          .hasMessage("공의 위치는 0이상 2하이여야 합니다.");
//    }



}
