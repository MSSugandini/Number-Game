import java.util.Random;
import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int randomNumber = rand.nextInt(100) + 1;
        //System.out.println("Random number is " + randomNumber);

        int tryCount = 0;
        while (true) {
            System.out.println("Enter your guess (1-100):");

            int userGuess = sc.nextInt();
            tryCount++;

            if (userGuess == randomNumber) {
                System.out.println("Great! You're Correct!");
                System.out.println("You got " + tryCount + " attempts");
                break;
            } else if (randomNumber > userGuess) {
                System.out.println("Oops! The number is too high. Guess again!");
            } else {
                System.out.println("Oops! The number is too low. Guess again!");
            }
        }

        sc.close();
        
    }
}
