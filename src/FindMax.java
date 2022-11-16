/**
 * this code prompt for two integers and
 * show which one is bigger
 * @author is me
 * @version 2022
 */
import java.util.Scanner;
public class FindMax
{
    public static void main(String[] args)
    {
        //variable declaration
        int a,         //first variable
                b;         //second
        String  str,   //read data from keyboard
                msg;   //display message
        Scanner input = new Scanner(System.in); //scanner object
        //prompt user for first and second numbers
        System.out.print("Enter first number: ");
        str = input.nextLine();
        a   = Integer.parseInt(str);
        System.out.print("Enter second number: ");
        str = input.nextLine();
        b   = Integer.parseInt(str);
        // assume both values are equal
        // test to see if first is larger, update msg
        // if second is larger, update msg
        msg = "both are equal";  //need to be updated
        if (a > b)
        {
            msg = "first number is larger one";  //need to be updated
        }
        else
        {
            msg = "second number is larger one";  //need to be updated
        }
        //display the message
        System.out.println(msg);
        //close scanner
        input.close();
    }
}