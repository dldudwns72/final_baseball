package baseball;

public class Judge {

    private Balls computerBalls;
    private Ball userBall;

    public Judge(Balls computerBalls, Ball userBall) {
        this.computerBalls = computerBalls;
        this.userBall = userBall;
    }

    public String discriminate() {

        String result = "NOTHING";

        for (int i = 0; i < computerBalls.getBalls().size(); i++) {

            Ball computerBall = computerBalls.getBalls().get(i);

            if (computerBall.getBall() == userBall.getBall()) {
                if (computerBall.getPosition() == userBall.getPosition()) {
                    result = "STRIKE";
                }

                if (computerBall.getPosition() != userBall.getPosition()) {
                    result = "BALL";
                }
            }

        }

        return result;
    }




}
