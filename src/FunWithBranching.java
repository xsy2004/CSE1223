/**
 * FunWithBranching
 *
 * @author Linus Xiong
 * @version 09/07/2022
 **/
import java.text.NumberFormat;
import java.util.Random;
import java.util.Scanner;

public class FunWithBranching {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a random number seed: ");
        int seed = input.nextInt();
        System.out.print("Enter your name: ");
        String name = input.next();
        System.out.println("Hello " + name + "!");
        System.out.println("Please answer the following questions:\n");
        Random rnd = new Random(seed);
        int x = rnd.nextInt(20) + 1;
        int y = rnd.nextInt(20) + 1;
        int count = 0;
        System.out.println(x + " + " + y + " = ");
        int plus = input.nextInt();
        if (plus == (x + y)){
            System.out.println("Correct!\n");
            count+=1;
        }else{
            System.out.println("Wrong!");
            System.out.println("The correct answer is: " + (x + y) + "\n");
        }

        System.out.println(x + " - " + y + " = ");
        int minus = input.nextInt();
        if (minus == (x - y)){
            System.out.println("Correct!\n");
            count+=1;
        }else{
            System.out.println("Wrong!");
            System.out.println("The correct answer is: " + (x - y) + "\n");
        }

        System.out.println(x + " * " + y + " = ");
        int multiply = input.nextInt();
        if (multiply == (x * y)){
            System.out.println("Correct!\n");
            count+=1;
        }else{
            System.out.println("Wrong!");
            System.out.println("The correct answer is: " + (x * y) + "\n");
        }

        System.out.println("You got " + count +  " correct answers!");
        double denominator = 3.0;
        double quotient = count/denominator;
        NumberFormat format = NumberFormat.getPercentInstance();
        format.setMaximumFractionDigits(2);
        System.out.println("That's " + format.format(quotient));
    }
}