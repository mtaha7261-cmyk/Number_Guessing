import java.util.Scanner;
import java.util.Random;
class Number_Guessing {
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int secretNumber = rand.nextInt(100) + 1;
        int guess = 0;
        int attempts = 0;
        System.out.println("Guess a number between 1 and 100:");
        while (guess != secretNumber) {
            System.out.print("Enter your guess: ");
            guess = input.nextInt();
            attempts++;
            if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > secretNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the number in " + attempts + " attempts,");
            }
        }
        
        

    }
}