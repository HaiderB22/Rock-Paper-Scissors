package rockPaperScissors;

public class App extends GameRps {
    private Player player;
    private Computer computer;
    private CHOICES playerChoice;
    private CHOICES computerChoice;
    private RESULTS result;

    public App() {

        super();
        player = new Player();
        computer = new Computer();
    }

    public void play(){

        playerChoice = player.getChoice();
        computerChoice = computer.getChoice();
        result = getResults();
        displayResults();
    }
    private void displayResults() {
        switch (result) {
            case Win:
                System.out.println(playerChoice + "beats" + computerChoice + " Player Wins!");
                break;
            case Lose:
                System.out.println(playerChoice + " loses to " + computerChoice + " Computer Wins!");
                break;
            case Tie:
                System.out.println(playerChoice + " equals to " + computerChoice + " its a Tie!");
                break;
        }
    }

    private RESULTS getResults() {

        if (playerChoice == computerChoice)
            return RESULTS.Tie;

        switch(playerChoice) {
            case Rock:
                return (computerChoice == CHOICES.Scissors ? RESULTS.Win : RESULTS.Lose);
            case Paper:
                return (computerChoice == CHOICES.Rock ? RESULTS.Win : RESULTS.Lose);
            case Scissors:
                return (computerChoice == CHOICES.Paper ? RESULTS.Win : RESULTS.Lose);

        }
        // it will not come to this as one fo the values needs to return true.
        return RESULTS.Lose;

    }
}