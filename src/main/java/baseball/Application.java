package baseball;

import baseball.view.InputView;

public class Application {
    public static void main(String[] args) {

        int gameRestartResult = 1;

        while (gameRestartResult == 1) {
            final InputView input = new InputView();
            GameFlowController gameFlowController = new GameFlowController(input);

            gameFlowController.gameFlow();

            gameRestartResult = input.inputChooseGameRestart();
        }
    }
}
