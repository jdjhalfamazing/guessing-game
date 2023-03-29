import java.util.Scanner;
import java.util.Random;

public class Guess {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1;
        int guess;
        int numGuesses = 0;
        boolean correctGuess = false;

        System.out.println("Welcome to the Guessing Game! I'm thinking of a number between 1 and 100. Can you guess what it is?");
        
        while (!correctGuess) {
            System.out.print("Enter your guess: ");
            guess = input.nextInt();
            numGuesses++;
            
            if (guess == randomNumber) {
                correctGuess = true;
                System.out.println("Congratulations! You guessed the number in " + numGuesses + " guesses!");
            } else if (guess < randomNumber) {
                System.out.println("Too low. Guess again!");
            } else {
                System.out.println("Too high. Guess again!");
            }
        }
        
        input.close();
    }

}
