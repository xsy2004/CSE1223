package Lab;

/**
 * Depend on the seed to return a random number.
 *
 * @author Linus Xiong
 * @version 09/19/2022
 */
import java.util.Scanner;
import java.util.Random;

public class GuessANumber {
    public static void main(String[] args) {
        int seed, userInput = 0, result, count = 0;
        Scanner input = new Scanner(System.in);
        // Get seed from user
        System.out.print("Enter a random seed: ");
        seed = input.nextInt();
        // set seed from user input
        Random random = new Random(seed);
        result = random.nextInt(200) + 1;
        System.out.println("DEBUG: The number picked is: " + result);

        //if userInput not equal to result then run, else not join the loop, direct to output success info.
        while (userInput != result){
            System.out.print("\nEnter a guess between 1 and 200: ");
            userInput = input.nextInt();
            if (userInput > 200 || userInput < 1){
                System.out.println("Your guess is out of range.  Pick a number between 1 and 200.");
            }
            if (userInput != result){
                System.out.println("That is not the number.");
            }

            count++;
        }
        System.out.println("Congratulations!  Your guess was correct!\n");
        System.out.println("I had chosen " + result + " as the target number.");
        System.out.println("You guessed it in " + count + " tries.");
    }
}
