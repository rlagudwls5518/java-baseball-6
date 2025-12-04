package baseball.view;

import baseball.dto.BaseballScore;

public class OutputView {

    private static final int WIN_CONDITION = 3;
    private static final int NOTHING_CONDITION = 3;

    public void gameStartView(){
        System.out.println("숫자 야구 게임을 시작합니다.");
    }
    private void gameEndView(){
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료\n"
                + "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }
    public void strikeView(int num){
        System.out.println(num+"스트라이크 ");
    }

    public void ballView(int num){
        System.out.print(num+"볼 ");
    }

    public void nothingView(){
        System.out.println("낫싱");
    }

    public void gamePrintView(BaseballScore result){
        if (result.getStrikeCount() == WIN_CONDITION) {
            strikeView(result.getStrikeCount());
            gameEndView();
        } else {
            if (result.getNothingCount()== NOTHING_CONDITION) {
                nothingView();
            } else {
                if (result.getBallCount() > 0) {
                    ballView(result.getBallCount());
                }

                if (result.getStrikeCount() > 0) {
                    strikeView(result.getStrikeCount());
                }
            }

        }
    }

}
