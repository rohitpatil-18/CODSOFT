import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int minRange = 1;
        int maxRange = 100;
        int maxAttempts = 10;
        int score = 0;

        System.out.println("Welcome to the Number Guessing Game!");

        do {
            int generatedNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            int attempts = 0;
            boolean guessedCorrectly = false;

            System.out.println("\nI have generated a number between " + minRange + " and " + maxRange + ". Can you guess it?");
            System.out.print("\nYou have only 10 guesses! ");

            while (attempts < maxAttempts) {
                System.out.print("\nEnter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == generatedNumber) {
                    System.out.println("WOW Congratulations! You guessed the correct number in " + attempts + " attempts.");
                    guessedCorrectly = true;
                    break;
                } else if (userGuess < generatedNumber) {
                    System.out.println("Guess Number is too low please Try again.");
                } else {
                    System.out.println("Guess Number is too high please Try again.");
                }
            }

            if (!guessedCorrectly) {
                System.out.println("\nSorry, your 10 attempts is over.");
                System.out.println("\nThe correct number was: " + generatedNumber);
            } else {
                score++;
            }

            System.out.print("Do you want to play again?");
            System.out.println(" \n(yes/no):");
        } while (scanner.next().equalsIgnoreCase("yes"));

        System.out.println("Gameee Overrrr. \nYour total score is: " + score);
        scanner.close();
    }
}
