/**
 * fix this code to read one integer and one string
 * string can include white space
 * @author Nima Mansouri
 * @version 20220906
 */
import java.util.Scanner;
public class CheckInput
{
    public static void main(String[] args)
    {
        //variable declaration
        int     iDum = -1;
        String  sDum = "INITIALIZED";
        Scanner obj  = new Scanner(System.in);

        System.out.println("0:----------- " + iDum + " " + sDum);
        //read in data
        System.out.print("Enter int     ");
        iDum = obj.nextInt();
        System.out.println("1:----------- " + iDum + " " + sDum);

        System.out.print("Enter string  ");
        sDum = obj.next();
        System.out.println("2:----------- " + iDum + " " + sDum);

        obj.close();
    }
}