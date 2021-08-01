package baseball;

import baseball.domain.Judgement;
import baseball.domain.NumberGenerator;
import baseball.domain.Referee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args){
        NumberGenerator generator = new NumberGenerator();
        List<Integer> computer = generator.createRandomNumber();

        Referee referee = new Referee();
        String result = referee.compare(computer,askNumbers());

        System.out.print(result);

    }

    public static List<Integer> askNumbers() {
        System.out.print("숫자를 입력해 주세요");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        List<Integer> numbers = new ArrayList<>();

        for(String number : input.split("")){
            numbers.add(Integer.valueOf(number));
        }

        return numbers;
    }
}
