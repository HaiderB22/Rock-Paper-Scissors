package rockPaperScissors;


import java.util.Scanner;

public class Player extends GameRps {
    Scanner scan;

    public Player()
    {
        super();
        scan = new Scanner(System.in); }
    public CHOICES getChoice() {
        System.out.println("Make a move! (R=rock /P=paper /S=scissors)");
        char playerChoice = scan.nextLine().toUpperCase().charAt(0);

        switch (playerChoice) {
            case 'R':
                return CHOICES.Rock;
            case 'P':
                return CHOICES.Paper;
            case 'S':
                return CHOICES.Scissors;
        }

        // if neither of the above are entered it is an invalid input
        System.out.println("invalid input!");
        return getChoice();




    }






}
