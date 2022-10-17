package academy.mindswap.Modulo1.MonstersGame2;

public class Main {
    public static void main(String[] args) {

        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");

        Game game1 = new Game(player1, player2);

        System.out.println(game1.playGame());
    }
}
