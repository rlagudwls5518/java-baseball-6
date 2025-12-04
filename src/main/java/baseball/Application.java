package baseball;


import baseball.controller.GameController;
import baseball.model.GameService;
import baseball.view.InputView;
import baseball.view.OutputView;

public class Application {
    public static void main(String[] args) {
        InputView input = new InputView();
        OutputView output = new OutputView();
        GameService gameService = new GameService();
        GameController gameController = new GameController(input, output, gameService);
        gameController.run();
    }
}
