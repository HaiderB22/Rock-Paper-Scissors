package rockPaperScissors;

import java.util.Random;

public class Computer extends GameRps {

    private Random random;

    public Computer()
    {
        super();
        random = new Random();

    }
    public CHOICES getChoice() {
        int choice = 1 + random.nextInt(3);

        switch (choice)
        {
            case 1:
                return CHOICES.Rock;
            case 2:
                return CHOICES.Paper;
        }

        //case 3
        return CHOICES.Scissors;


    }
}
