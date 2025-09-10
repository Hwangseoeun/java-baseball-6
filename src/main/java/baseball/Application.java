package baseball;

import baseball.controller.GameFlowController;
import baseball.view.InputView;
import baseball.view.OutputView;

public class Application {
    public static void main(String[] args) {

        int gameRestartResult = 1;

        while (gameRestartResult == 1) {
            final InputView input = new InputView();
            final OutputView output = new OutputView();

            GameFlowController gameFlowController = new GameFlowController(input, output);

            gameFlowController.gameFlow();

            gameRestartResult = input.inputChooseGameRestart();
        }
    }
}
