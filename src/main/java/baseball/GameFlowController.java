package baseball;

import baseball.model.Numbers;
import baseball.view.InputView;

public class GameFlowController {

    private final InputView inputView;

    public GameFlowController(InputView inputView) {
        this.inputView = inputView;
    }

    public void gameFlow() {
        final Numbers answerDigits = RandomNumberPicker.answerDigits();
        final Numbers guessedNumberDigits = inputView.inputGuessedNumber();
    }
}
