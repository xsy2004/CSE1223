package Lab;

/**
 * Program to copy one file into another, using command line arguments
 *
 * @author Linus Xiong
 * @version 10/26/2022
 *
 */
import java.io.FileNotFoundException;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class FunWithFiles {

    /**
     * Displays the file given by fname to the screen
     *
     * @param fname file to be displayed
     */
    public static void displayFile(String fname) {
        try {
            // read file depend on the input
            File file = new File(String.format("src/Lab/FunWithFiles/%s", fname));
            Scanner readFile = new Scanner(file);
            // use while loop until the file don't hava other content
            while (readFile.hasNext()) {
                System.out.print(readFile.nextLine() + "\n");
            }
            readFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("ERROR - File " + fname + " not found!");
            // e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        String fileName;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a filename: ");
        fileName = scan.nextLine();
        displayFile(fileName);
    }

}
