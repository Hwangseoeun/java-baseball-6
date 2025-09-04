package baseball;

import baseball.view.InputView;

public class Application {
    public static void main(String[] args) {

        final InputView input = new InputView();

        GameFlowController gameFlowController = new GameFlowController(input);

        gameFlowController.gameFlow();
    }
}
