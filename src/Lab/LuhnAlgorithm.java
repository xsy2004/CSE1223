package Lab;
/**
 * check card number is illegal or not.
 *
 * @author Linus Xiong
 * @version 09242022
 */
import java.util.Scanner;

public class LuhnAlgorithm {
    public static void main(String[] args) {
        String userCardNumber;
        Scanner input = new Scanner(System.in);
        // while loop make always ask card number.
        while (true){
            System.out.print("Enter a credit card number (enter a blank line to quit): ");
            userCardNumber = input.nextLine();
            // if user input blank line then quit.
            if (userCardNumber.equals("")){
                System.out.println("Goodbye!");
                break;
            }else if (userCardNumber.length() != 16){
                System.out.println("ERROR! Number MUST have exactly 16 digits.\n");
            }else {
                int cardNumberSum = 0;
                //total card number length is 16, if not, the number will illegal.
                for (int i = 0; i < 15; i++){
                    char digitCardNumberChar = userCardNumber.charAt(i);
                    int digitCardNumberInt = Character.getNumericValue(digitCardNumberChar);
                    cardNumberSum = cardNumberSum + digitCardNumberInt;
                }
                System.out.println("DEBUG: Sum is " + cardNumberSum);
                System.out.println("Check digit is: " + userCardNumber.charAt(15) + "\n");
            }

        }
        input.close();
    }
}
