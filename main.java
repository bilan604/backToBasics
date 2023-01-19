import java.util.Scanner;


class MyClass {
    public static void main(String args[]) {
        ConnectFour game = new ConnectFour();
        boolean activePlayer = true;
        Scanner sc = new Scanner(System.in);
        game.viewBoard();
        while (!game.over()) {
            game.play(activePlayer, sc);
            activePlayer = !activePlayer;
        }
        System.out.println("Game Over :(");
        sc.close();
    }
}