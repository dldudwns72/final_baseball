package baseball.domain;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class RefereeTest {

    private Referee referee;

    @BeforeEach
    void setUp(){
        referee = new Referee();
    }

    @Test
    @DisplayName("3스트라이크")
    void STRIKE(){
        String result = referee.compare(Arrays.asList(1,2,3),Arrays.asList(1,2,3));
        assertThat(result).isEqualTo("0 볼 3 스트라이크");
    }

    @Test
    @DisplayName("3볼")
    void BALL(){
        String result = referee.compare(Arrays.asList(3,1,2),Arrays.asList(1,2,3));
        assertThat(result).isEqualTo("3 볼 0 스트라이크");
    }

    @Test
    @DisplayName("아웃")
    void OUT(){
        String result = referee.compare(Arrays.asList(5,6,7),Arrays.asList(1,2,3));
        assertThat(result).isEqualTo("아웃");
    }




}
