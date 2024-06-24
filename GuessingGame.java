import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Generate a random number between 1 and 100
        int randomNumber = (int) (Math.random() * 100) + 1;

        // Prompt the user to guess the number
        System.out.println("Guess a number between 1 and 100: ");

        // Get the user's guess
        int guess = scanner.nextInt();

        // Check if the guess is correct
        if (guess == randomNumber) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect. The number was " + randomNumber);
        }
    }
}