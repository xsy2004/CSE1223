package Lab;

/**
 * Encodes a String entered by a user.
 *
 * @author Linus Xiong
 * @version 11/15/2022
 */
import java.util.Scanner;

public class EncodingLab {

    public static final String CAPITALS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    /**
     * Method that returns a string that is rot13 encoded from the input string.
     *
     * @param input
     *            The string to encode
     * @return The input string with the rot13 algorithm applied to it
     */
    public static String rot13(String input) {
        StringBuilder sb = new StringBuilder();
        String[] text = input.split("");
        // make all string to handle
        for (int i = 0; i < input.length(); i++){
            // let all string to list
            sb.append(text[i]);
            // change letter
            if (Character.isLetter(text[i].charAt(0))){
                int index = CAPITALS.indexOf(text[i]);
                sb.deleteCharAt(i);
                if ((index + 13) >= 26){
                    // do not allow out of bounds
                    char result = CAPITALS.charAt((index+13) % 13);
                    sb.insert(i, result);
                }else {
                    char result = CAPITALS.charAt(index+13);
                    sb.insert(i, result);
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a string to encode: ");
        String input = keyboard.nextLine();
        String encoded = rot13(input);
        System.out.println("Your string encoded is  : " + encoded);
        keyboard.close();
    }

}
