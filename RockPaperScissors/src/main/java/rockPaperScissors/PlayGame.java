package rockPaperScissors;

import java.util.Scanner;

public class PlayGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        App game = new App();
        char quit = ' ';


        while (quit != 'N') {
            game.play();

            System.out.println(" Play again? press any key or 'N' to quit.");
            quit = scan.nextLine().toUpperCase().charAt(0);

        }

        scan.close();
    }

}
