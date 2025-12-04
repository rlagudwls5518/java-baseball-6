package baseball.controller;

import baseball.dto.BaseballScore;
import baseball.model.GameService;
import baseball.view.InputView;
import baseball.view.OutputView;
import java.util.List;

public class GameController {

    private final InputView input;
    private final OutputView output;
    private final GameService gameService;

    public GameController(InputView input, OutputView output, GameService gameService) {
        this.input = input;
        this.output = output;
        this.gameService = gameService;
    }

    public void run() {

        output.gameStartView();

        while (true) {
            List<Integer> computerNumbers = gameService.generaterNewNumber();
            startGameLoop(computerNumbers);
            if(input.restartGame(input.reGameInput())){
                break;
            }
        }
    }

    private void startGameLoop(List<Integer> computerNumbers){
        while (true) {
            String number = input.gameInput();
            BaseballScore calculatedNumber = gameService.playOneGame(number, computerNumbers);
            output.gamePrintView(calculatedNumber);
            if (!calculatedNumber.checkGameTry()) {
                break;
            }
        }
    }
}
