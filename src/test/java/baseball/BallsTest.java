package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BallsTest {

    @Test
    @DisplayName("세자리 수 생성")
    void createBalls(){
        Balls balls = new Balls(Arrays.asList(1,2,3));

    }
}
