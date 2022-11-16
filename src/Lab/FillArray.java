package Lab;

import java.util.Scanner;

/**
 * Creat a array by the user input data.
 *
 * @author Linus Xiong
 * @version 10/07/2022
 */
public class FillArray {
    public static void main(String[] args) {
        int userInput, enterInterger;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number of digits to be stored: ");
        // Get user input
        userInput  = input.nextInt();
        if (userInput == 0){
            System.out.println("No digits to store? Goodbye!");
        }else {
            if (userInput < 0){
                System.out.println("ERROR! You must enter a non-negative number of digits!\n");
                // Make user input again
                System.out.print("Please enter the number of digits to be stored: ");
                userInput  = input.nextInt();
            }
            // Creat an array to put data
            int[] Array = new int[userInput];
            // Usr for loop to get data
            for (int i = 0; i < userInput; i++ ){
                System.out.print("Enter integer " + i + ": ");
                enterInterger = input.nextInt();
                Array[i] = enterInterger;
            }
            System.out.println("The contents of your array:");
            System.out.println("Number of digits in array: " + Array.length);
            System.out.print("Digits in array:");
            // To traverse array
            for(int j : Array){
                System.out.print(" " + j);
            }
            System.out.println();
        }
    }
}
