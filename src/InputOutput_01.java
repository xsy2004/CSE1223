
import java.util.Scanner;

public class InputOutput_01{
    //public static void main(String[] args) {
    public static int max(int a, int b){

        Scanner input = new Scanner(System.in);
        int numOne, numTwo;
        String nameOne;
        System.out.print("Enter the first: ");
        numOne = input.nextInt();
        System.out.print("Enter the second: ");
        numTwo = input.nextInt();
        System.out.print("Enter your name: ");
        input.nextLine();
        nameOne = input.nextLine();
        System.out.println(nameOne + ", the difference is " + (numOne - numTwo));
        input.close();
        return numOne;
    }
}
