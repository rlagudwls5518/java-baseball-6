package baseball;

import baseball.view.OutputView;
import java.util.List;

public class ResultGame {

    private final List<Integer> result;
    private final OutputView outputView;
    private static final int INDEX_STRIKE = 0;
    private static final int INDEX_BALL = 1;
    private static final int INDEX_NOTHING = 2;

    private static final int WIN_CONDITION = 3;
    private static final int NOTHING_CONDITION = 3;

    public ResultGame(List<Integer> result, OutputView outputView) {
        this.result = result;
        this.outputView = outputView;
    }

    public boolean gameResult() {

        if (result.get(INDEX_STRIKE) == WIN_CONDITION) {
            outputView.strikeView(result.get(INDEX_STRIKE));
            return false;
        } else {
            if (result.get(INDEX_NOTHING) == NOTHING_CONDITION) {
                outputView.nothingView();
            } else {
                if (result.get(INDEX_BALL) > 0) {
                    outputView.ballView(result.get(INDEX_BALL));
                }

                if (result.get(INDEX_STRIKE) > 0) {
                    outputView.strikeView(result.get(INDEX_STRIKE));
                }
            }
            return true;
        }
    }
}
