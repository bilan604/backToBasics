import java.util.Scanner;


class MyClass {
    public static void main(String args[]) {
        ConnectFour game = new ConnectFour();
        Scanner sc = new Scanner(System.in);
        boolean activePlayer = true;
        String winner = "";

        game.viewBoard();
        while (winner.equals("")) {
            game.play(activePlayer, sc);
            activePlayer = !activePlayer;
            winner = game.hasWinner();
        }
        System.out.println("Game Over!");
        sc.close();
    }
}