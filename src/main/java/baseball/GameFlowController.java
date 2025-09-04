package baseball;

import baseball.view.InputView;

import java.util.List;

public class GameFlowController {

    private final InputView inputView;

    public GameFlowController(InputView inputView) {
        this.inputView = inputView;
    }

    public void gameFlow() {
        final List<Integer> answerDigits = RandomNumberPicker.answerDigits();
    }
}
