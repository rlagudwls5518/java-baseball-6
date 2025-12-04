package baseball.model;

import baseball.dto.BaseballScore;
import baseball.view.OutputView;

public class ResultGame {

    private final BaseballScore result;
    private final OutputView outputView;
    private static final int WIN_CONDITION = 3;
    private static final int NOTHING_CONDITION = 3;

    public ResultGame(BaseballScore result, OutputView outputView) {
        this.result = result;
        this.outputView = outputView;
    }

    public boolean gameResult() {

        if (result.getStrikeCount() == WIN_CONDITION) {
            outputView.strikeView(result.getStrikeCount());
            return false;
        } else {
            if (result.getNothingCount()== NOTHING_CONDITION) {
                outputView.nothingView();
            } else {
                if (result.getBallCount() > 0) {
                    outputView.ballView(result.getBallCount());
                }

                if (result.getStrikeCount() > 0) {
                    outputView.strikeView(result.getStrikeCount());
                }
            }
            return true;
        }
    }
}
