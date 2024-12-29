import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;
        int score = 0;

        System.out.println("Welcome to the Guess the Number Game!");

        while (playAgain) {
            int numberToGuess = random.nextInt(100) + 1; // Generates a number between 1 and 100
            int attemptsLeft = 10;
            boolean guessedCorrectly = false;

            System.out.println("\nYou have selected a number between 1 and 100.");
            System.out.println("You have " + attemptsLeft + " attempts to guess the correct number.");

            while (attemptsLeft > 0) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();

                if (userGuess == numberToGuess) 
                {
                    System.out.println("Congratulations! You guessed the correct number.");
                    score++;
                    guessedCorrectly = true;
                    break;
                } else if (userGuess < numberToGuess) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Too high!");
                }

                attemptsLeft--;
                System.out.println("Attempts remaining: " + attemptsLeft);
            }

            if (!guessedCorrectly) {
                System.out.println("Sorry, you've run out of attempts. The correct number was " + numberToGuess + ".");
            }

            System.out.println("\nYour current score: " + score);
            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = scanner.next().equalsIgnoreCase("yes");
        }

        System.out.println("\nThank you for playing! Your final score: " + score);
        scanner.close();
    }
}