package Project;

/**
 * A class to encode or decode the file
 * @author Linus
 * @version 11/21/2022
 */
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SubstitutionCipher {

    /**
     * Private constants used to shift characters for the substitution cipher.
     */
    private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";

    /**
     * Constructs a new String where each letter in the String input is shifted
     * by the amount shift to the right, preserving whether the original
     * character was uppercase or lowercase. For example, the String "ABC" with
     * shift 3 would cause this method to return "DEF". A negative value should
     * shift to the left. For example, the String "ABC" with shift -3 would
     * cause this method to return "XYZ". Punctuation, numbers, whitespace and
     * other non-letter characters should be left unchanged. NOTE: For full
     * credit you are REQUIRED to use a StringBuilder to build the String in
     * this method rather than using String concatenation.
     *
     * @param input
     *            String to be encrypted
     * @param shift
     *            Amount to shift each character of input to the right
     * @return the encrypted String as outlined above
     */
    public static String shift(String input, int shift) {
        StringBuilder return_list = new StringBuilder();
        String[] text = input.split("");
        String control = null;
        // allow all input to change
        for (int i = 0; i < input.length(); i++){
            return_list.append(text[i]);
            if (Character.isLetter(text[i].charAt(0))){
                // separate uppercase and lowercase
                if (Character.isUpperCase(text[i].charAt(0))){
                    control = UPPERCASE;
                }else {
                    control = LOWERCASE;
                }
                int index = control.indexOf(text[i]);
                // delete the letter that need to encode/decode
                return_list.deleteCharAt(i);
                if (shift < 0){
                    // avoid the letter index out of bounds
                    shift = 26 + (shift % 26);
                    char result = control.charAt((index + shift) % 26);
                    // add encode/decode to list
                    return_list.insert(i, result);
                }else {
                    char result = control.charAt((index + shift)  % 26);
                    return_list.insert(i, result);
                }
            }
        }
        return return_list.toString();
    }

    /**
     * Displays the message "promptMsg" to the user and reads the next full line
     * that the user enters. If the user enters an empty string, reports the
     * error message "ERROR! Empty Input Not Allowed!" and then loops,
     * repeatedly prompting them with "promptMsg" to enter a new string until
     * the user enters a non-empty String
     *
     * @param in
     *            Scanner to read user input from
     * @param promptMsg
     *            Message to display to user to prompt them for input
     * @return the String entered by the user
     */
    public static String promptForString(Scanner in, String promptMsg) {
        String result = null;
        System.out.print(promptMsg);
        result = in.nextLine();
        // while loop to make sure to input correct.
        while (result.equals("")){
            System.out.println("ERROR! Empty Input Not Allowed!");
            System.out.print(promptMsg);
            result = in.nextLine();
        }
        return result;
    }

    /**
     * Opens the file inFile for reading and the file outFile for writing,
     * reading one line at a time from inFile, shifting it the number of
     * characters given by "shift" and writing that line to outFile. If an
     * exception occurs, must report the error message: "ERROR! File inFile not
     * found or cannot write to outFile" where "inFile" and "outFile" are the
     * filenames given as parameters.
     *
     * @param inFile
     *            the file to be transformed
     * @param outFile
     *            the file to write the transformed output to
     * @param shift
     *            the amount to shift the characters from inFile by
     * @return false if an exception occurs and the error message is written,
     *         otherwise true
     */
    public static boolean transformFile(String inFile, String outFile,
                                        int shift) {
        try {
            File file = new File(String.format("src/Project/SubstitutionCipher/%s", inFile));
            BufferedWriter out = new BufferedWriter(new FileWriter(String.format("src/Project/SubstitutionCipher/%s", outFile)));
            Scanner read = new Scanner(file);
            while (read.hasNext()) {
                // use shift to encode/decode
                out.write(shift(read.nextLine() + "\n", shift));
            }
            out.close();
            System.out.println("Finished writing to file." + "\n");
            return true;
        } catch (IOException e) {
            System.out.println("ERROR! File " + inFile + " not found or cannot write to " + outFile);
            return false;
        }
    }

    /**
     * Prompts the user to enter a single character choice. The only allowable
     * values are 'E', 'D' or 'Q'. All other values are invalid, including all
     * values longer than one character in length, however the user is allowed
     * to enter values in either lower or upper case. If the user enters an
     * invalid value, the method displays the error message "ERROR! Enter a
     * valid value!" and then prompts the user repeatedly until a valid value is
     * entered. Returns a single uppercase character representing the user's
     * choice.
     *
     * @param in
     *            Scanner to read user choices from
     * @return the user's choice as an uppercase character
     */
    public static char getChoice(Scanner in) {
        ArrayList<String> character = new ArrayList<String>(Arrays.asList("E", "D", "Q", "e", "d", "q"));
        System.out.print("Enter your choice: ");
        String userChoice;
        userChoice = in.nextLine();
        // make the upper letter and lower letter correct.
        while (userChoice.equals("") || !character.contains(userChoice)){
            System.out.println("ERROR! Enter a valid value!");
            System.out.print("Enter your choice: ");
            userChoice = in.nextLine();
        }

        return UPPERCASE.charAt(UPPERCASE.indexOf(userChoice.toUpperCase()));
    }

    /**
     * Displays the menu of choices to the user.
     */
    public static void displayMenu() {
        System.out.println("[E]ncode a file");
        System.out.println("[D]ecode a file");
        System.out.println("[Q]uit");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputFile;
        String outputFile;
        int shift;
        char userChoice = 0;
        while (userChoice != 'Q'| userChoice != 'q'){
            displayMenu();
            userChoice = getChoice(in);
            // make while loop exit
            if (userChoice == 'q' | userChoice == 'Q'){
                System.out.println("\nGoodbye!");
                break;
            }
            inputFile = promptForString(in, "Enter an input file: ");
            outputFile = promptForString(in, "Enter an output file: ");
            System.out.print("Enter a shift amount: ");

            shift = Integer.parseInt(in.nextLine());
            if (shift > 0){
                // make decode to become origin.
                if (userChoice == 'D'){
                    shift = 26 - shift;
                }
                transformFile(inputFile, outputFile, shift);
            }else {
                System.out.println("Error");
            }
        }
        in.close();
    }

}
