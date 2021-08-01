package baseball;

import baseball.domain.Judgement;
import baseball.domain.NumberGenerator;
import baseball.domain.Referee;

import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args){
        Referee referee = new Referee();
        String result = referee.compare(Arrays.asList(1,2,3),Arrays.asList(1,2,3));

        System.out.print(result);

    }
}
