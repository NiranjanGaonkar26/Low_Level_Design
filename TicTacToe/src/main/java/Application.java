public class Application {
    public static void main(String[] args) {
        GameLogic game = new GameLogic();
        game.initializeGame();
        System.out.println("The winner is: "+game.startGame());
    }
}
