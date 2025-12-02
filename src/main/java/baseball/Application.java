package baseball;


public class Application {
    public static void main(String[] args) {
        Input input = new Input();

        GameController gameController = new GameController(input);
        gameController.run();
    }
}
