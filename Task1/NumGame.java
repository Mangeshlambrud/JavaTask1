import java.util.Random;
import java.util.Scanner;

public class NumGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int min = 1;
        int max = 100;
        int attempts = 0;
        int score = 0;
        boolean playAgain = true;

        System.out.println("Welcome to the Number Guessing Game!");

        while (playAgain) {
            int randomNumber = rand.nextInt(max - min + 1) + min;
            int remainingAttempts = 10;   //Limit The Number Of Attempts

            System.out.println("I Have Selectd a random Number Between " + min + " And " + max + ". Try to guess it!");
            while (remainingAttempts > 0) {
                System.out.println("Enter your guess(remaining attempts: " + remainingAttempts + "): ");
                int userGuess = sc.nextInt();
                attempts++;
                remainingAttempts--;

                if (userGuess == randomNumber) {
                    System.out.println("Congratulation! You guessed the correct number: " + randomNumber);
                    score++;
                    break;
                }
                else if (userGuess < randomNumber) {
                    System.out.println("Your guess is to low.");
                }
                else {
                    System.out.println("Your guess is to hogh.");
                }

                if (remainingAttempts == 0) {
                    System.out.println("You have run out of attempts. The correct number was: " + randomNumber);
                }
                
            }

            System.out.print("Do you want to play again? (Yes/No): ");
            String playAgainResponse = sc.next().toLowerCase();

            if (playAgainResponse.equals("No")) {
                playAgain = false;
            }
            
        }

        System.out.println(" Game Over! You palyed " + attempts + " times and won " + score + " rounds. ");
        sc.close();
    }
    
}
