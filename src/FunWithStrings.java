/**
 * report about a long string
 *
 * @author Linus Xiong
 * @version 20220904
 */
import java.util.Scanner;

public class FunWithStrings {

    public static void main(String[] args) {
        String longString, subString, rpmString;
        int position;
        System.out.print("Enter a long string: ");
        Scanner input = new Scanner(System.in);
        longString = input.nextLine();
        System.out.print("Enter a substring: ");
        subString = input.next();
        System.out.println("Length of your string: " + longString.length());
        System.out.println("Length of your substring: " + subString.length());
        System.out.println("Starting position of your substring: " + longString.indexOf(subString));
        System.out.println("String before your substring: " + longString.substring(0, longString.indexOf(subString)));
        System.out.println("String after your substring: " + longString.substring(longString.indexOf(subString) + subString.length()));
        System.out.print("Enter a position between 0 and " + (longString.length() - 1) + ": ");
        position = input.nextInt();
        //System.out.println("The character at position " + position + " is " + longString.split("")[position]);
        System.out.println("The character at position " + position + " is " + longString.charAt(position));
        System.out.print("Enter a replacement string: ");
        rpmString = input.next();
        //System.out.println("Your new string is: " + longString.substring(0, longString.indexOf(subString)) + rpmString + longString.substring(longString.indexOf(subString) + subString.length()));
        System.out.println("Your new string is: " + longString.replace(subString, rpmString));
        System.out.println("Goodbye!");
    }
}
