package Project;

/**
 * Guess a number and return a comment for user-input
 *
 * @author Linus Xiong
 * @version 23/09/2022
 */
import java.util.Scanner;
import java.util.Random;

public class GuessANumber {

    public static void main(String[] args) {
        int seed, userInput = 0, result, count = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a random seed: ");
        seed = input.nextInt();// Get seed from user
        Random random = new Random(seed);// set seed from user input
        result = random.nextInt(200) + 1;//integer between 1 and 200

        while (userInput != result){
            System.out.print("Enter a guess between 1 and 200: ");
            userInput = input.nextInt();//get user guess number
            //if user input is out of range then return notice
            if (userInput > 200 || userInput < 0){
                System.out.println("Your guess is out of range.  Pick a number between 1 and 200.");
            }
            count++;//get total number of attempts
            if (userInput != result){
                if (userInput > result){
                    System.out.println("Your guess was too high - try again.\n");
                }else {
                    System.out.println("Your guess was too low - try again.\n");
                }
            }else {
                System.out.println("Congratulations!  Your guess was correct!");
            }
        }
        System.out.println("\nI had chosen " + result + " as the target number.");
        System.out.println("You guessed it in " + count + " tries.");
        //use switch to reduce multi-branch
        switch (count){
            case 1:
                System.out.println("That was impossible!");
                break;
            case 8:
                System.out.println("That was not very impressive.");
                break;
            default:
                //this code used for judge attempts, and return comment.
                if (count >= 2 && count <= 3) System.out.println("You're pretty lucky!");
                else if (count >= 4 && count <= 7) System.out.println("Not bad, not bad...");
                else if (count >= 9 && count <= 10) System.out.println("Are you having any fun at all?");
                else if (count >= 11) System.out.println("Maybe you should play something else.");
        }
    }
}
