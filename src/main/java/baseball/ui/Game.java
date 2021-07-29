package baseball.ui;

import baseball.Ball;
import baseball.Balls;

import java.util.*;

public class Game {
    public static void main(String args[]) {

    }

    public List<Integer> askNumbers(){
        System.out.print("숫자를 입력해 주세요");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        List<Integer> numbers = new ArrayList<>();
        input.split("");

        for(String number : input.split("")){
            numbers.add(Integer.valueOf(number));
        }

        return numbers;
    }
}
