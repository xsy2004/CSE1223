package Project;
import java.util.Scanner;
/**
 * Depend on the user input target distance to get best data.
 *
 * @author Linus Xiong
 * @version 10/06/2022
 **/
public class TrajectoryModeling {
    public static void main(String[] args) {
        // Make some variables.
        double timeOfDistance, iniVelocity, angleProjectile, missedDistance, targetDistance, distanceOfProjectile, templeDistance;
        double resultAngle = 0, resultVelocity = 0, resultDistance = 0;
        templeDistance = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a distance to target: ");
        // Get user input.
        targetDistance = input.nextDouble();
        // Make for loop to traverse all angle and velocity.
        for (iniVelocity = 1.00; iniVelocity <= 30.00; iniVelocity++){
            for (angleProjectile = 25.00; angleProjectile <= 90; angleProjectile = angleProjectile + 5){
                timeOfDistance = (2.00 * iniVelocity * Math.sin(Math.toRadians(angleProjectile))) / 9.80;
                distanceOfProjectile = iniVelocity * timeOfDistance * Math.cos(Math.toRadians(angleProjectile));
                missedDistance = targetDistance - distanceOfProjectile;
                // To filter data that some lower.
                if (templeDistance > missedDistance && missedDistance > 0){
                    // Allow variable can be read by outside.
                    templeDistance = missedDistance;
                    resultAngle = angleProjectile;
                    resultVelocity = iniVelocity;
                    resultDistance = distanceOfProjectile;
                }
            }
        }
        // Format print out.
        System.out.format("\nBest angle: %.2f%n", resultAngle);
        System.out.format("Best speed: %.2f%n", resultVelocity);
        System.out.format("Distance travelled: %.2f%n", resultDistance);
        System.out.format("Missed the target center by: %.2f%n", templeDistance);
    }
}
