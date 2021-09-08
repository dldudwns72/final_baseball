package ui;

import baseball.Ball;
import baseball.Balls;

import java.util.*;

public class InputView {

    private static final String INPUT_USER_BALL = "숫자를 입력해주세요.";

    public static Balls createComputerBalls() {
        List<Ball> balls = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            int randomNumber = new Random().nextInt(10) - 1;
            balls.add(new Ball(i, randomNumber));
        }

        Balls computerBalls = new Balls(balls);

        return computerBalls;
    }

    public static Balls createUserBalls() {
        System.out.println(INPUT_USER_BALL);

        Scanner scanner = new Scanner(System.in);
        List<String> userBallsSplit = Arrays.asList(scanner.nextLine().split(""));

        return splitUserBalls(userBallsSplit);
    }

    private static Balls splitUserBalls(List<String> userBallsSplit){
        List<Ball> balls = new ArrayList<>();

        for (int i = 0; i < userBallsSplit.size(); i++) {
            int ballNumber = Integer.parseInt(userBallsSplit.get(i));
            balls.add(new Ball(i, ballNumber));
        }

        Balls userBalls = new Balls(balls);

        return userBalls;
    }
}
