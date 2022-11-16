package Project;

/**
 * Program to copy one file into another, using command line arguments
 *
 * @author Linus Xiong
 * @version 11/05/2022
 *
 */
import java.io.FileNotFoundException;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class FilesExpanded {

    /**
     * Displays the file given by fname to the screen
     *
     * @param fname file to be displayed
     */
    public static void displayFile(String fname) {
        //TODO: Open the file and print each line to the screen.
        //TODO: Don't forget to close the file when you are done.
        try {
            // read file
            File file = new File(String.format("src/Lab/FunWithFiles/%s", fname));
            Scanner readFile = new Scanner(file);
            // use while loop until the file don't hava other content
            while (readFile.hasNext()) {
                System.out.print(reverse(readFile.nextLine()) + "\n");
            }
            readFile.close();
        } catch (FileNotFoundException e) {
            // if file not fount then print some error info.
            System.out.println("ERROR - File " + fname + " not found!");
        }
    }

    /**
     * Creates a reversed copy of a String
     *
     * @param str string to be reversed
     * @return reversed copy of str
     */
    public static String reverse(String str) {
        // use a simple way to reverse the string
        String reverse = new StringBuffer(str).reverse().toString();
        return reverse;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a filename (blank line to quit): ");
        String userInput = input.nextLine();
        // say goodbye
        if (userInput.isEmpty() || userInput.equals(" ")){
            System.out.println("\nGoodbye!");
        }else {
            displayFile(userInput);
            // use while loop to make user input continuously
            while (!userInput.isEmpty()){
                System.out.print("\nEnter another filename (blank line to quit): ");
                userInput = input.nextLine();
                if (userInput.isEmpty() || userInput.equals(" ")){
                    System.out.println("\nGoodbye!");
                }else {
                    displayFile(userInput);
                }

            }
        }
    }
}
