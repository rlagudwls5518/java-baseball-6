package baseball.view;

public class OutputView {

    public void gameStartView(){
        System.out.println("숫자 야구 게임을 시작합니다.");
    }
    public void gameEndView(){
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료\n"
                + "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }
    public void strikeView(int num){
        System.out.print(num+"스트라이크 ");
    }

    public void ballView(int num){
        System.out.print(num+"볼 ");
    }

    public void nothingView(){
        System.out.print("낫싱");
    }

}
