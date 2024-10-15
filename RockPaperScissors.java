import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] choices = {"Rock", "Paper", "Scissors"};
        int userScore = 0;
        int computerScore = 0;

        while (true) {
            System.out.print("Enter your choice (Rock, Paper, Scissors) or 'exit' to quit: ");
            String userChoice = scanner.nextLine();

            if (userChoice.equalsIgnoreCase("exit")) {
                break;
            }

            if (!userChoice.equalsIgnoreCase("Rock") && 
                !userChoice.equalsIgnoreCase("Paper") && 
                !userChoice.equalsIgnoreCase("Scissors")) {
                System.out.println("Invalid choice. Please try again.");
                continue;
            }

            int computerChoiceIndex = random.nextInt(3);
            String computerChoice = choices[computerChoiceIndex];

            System.out.println("Computer chose: " + computerChoice);

            if (userChoice.equalsIgnoreCase(computerChoice)) {
                System.out.println("It's a tie!");
            } else if ((userChoice.equalsIgnoreCase("Rock") && computerChoice.equals("Scissors")) ||
                       (userChoice.equalsIgnoreCase("Paper") && computerChoice.equals("Rock")) ||
                       (userChoice.equalsIgnoreCase("Scissors") && computerChoice.equals("Paper"))) {
                System.out.println("You win!");
                userScore++;
            } else {
                System.out.println("You lose!");
                computerScore++;
            }

            System.out.println("Score: You " + userScore + " - Computer " + computerScore);
        }

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}
