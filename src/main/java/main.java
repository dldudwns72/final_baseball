import baseball.Balls;
import ui.InputView;
import ui.ResultView;

public class main {
    public static void main(String[] args){
        Balls computerBalls = InputView.createComputerBalls();
        Balls userBalls = InputView.createUserBalls();

        ResultView.gaming(computerBalls,userBalls);

        ResultView.gameResult();
    }
}
