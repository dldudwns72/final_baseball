package baseball;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Referee {

    private Balls computerBalls;
    private Balls userBalls;

    public Referee(Balls computerBalls, Balls userBalls) {
        this.computerBalls = computerBalls;
        this.userBalls = userBalls;
    }

    public String gameResult() {
        List<String> resultList = new ArrayList<>();

        for (int i = 0; i < computerBalls.getBalls().size(); i++) {
            Ball computerBall = computerBalls.getBalls().get(i);
            for (int j = 0; j < userBalls.getBalls().size(); j++) {
                Ball userBall = userBalls.getBalls().get(j);

                if(computerBall.getPosition() == userBall.getPosition()){

                }

            }
        }

        return null;
    }

//    private String judgeResult(Ball computerBall, Balls userBalls) {
//
//        String result = null;
//        for (int i = 0; i < userBalls.getBalls().size(); i++) {
//            Ball userBall = userBalls.getBalls().get(i);
//
//            result = new Judge(computerBall, userBall).discriminate();
//        }
//
//        return result;
//    }

//    private String getResult(List<String> resultList) {
//
//        String nothingResult = resultList.stream().filter(f -> f.equals("NOTHING")).count() + "NOTHING";
//
//        String ballResult = resultList.stream().filter(f -> f.equals("BALL")).count() + "BALL";
//
//        String StrikeResult = resultList.stream().filter(f -> f.equals("STRIKE")).count() + "STRIKE";
//
//        return StrikeResult + " " + ballResult + " " + nothingResult;
//    }


}
