package Lab;

import java.util.Scanner;

/**
 * Compute the distance traveled for every possible angle in the simulator.
 *
 * @author Linus Xiong
 * @version 10/02/2022
 **/
public class TrajectoryModelingIntro {

    public static void main(String[] args) {
        double timeOfDistance, distance, userInput, velocity, angleProjectile;
        Scanner input = new Scanner(System.in);
        // Let user input their number.
        System.out.print("Enter an initial speed: ");
        // Get a double type number.
        userInput = input.nextDouble();
        // Make sure enter number between 1-30.
        if (userInput > 1 && userInput < 30){
            velocity = userInput;
            // Let the interval is 5, until add to 90, then finish.
            for (angleProjectile = 25.00; angleProjectile < 90.00; angleProjectile = angleProjectile + 5.00){
                // Math.sin() and Math.cos() should use Radians.
                timeOfDistance = (2.00 * velocity * Math.sin(Math.toRadians(angleProjectile))) / 9.80;
                distance = velocity * timeOfDistance * Math.cos(Math.toRadians(angleProjectile));
                System.out.format("\nAt angle " + "%.2f" + " projectile travels " + "%.2f" + " meters", angleProjectile, distance);
            }
            System.out.print("\n");
        }else {
            System.out.println("User Input Error, Please enter the number between 1-30.");
        }
        // Never forget to close Scanner Class.
        input.close();
    }
}
