package Lab;

/**
 * Format provided csv data and calculate the difference in population.
 *
 * @author Linus Xiong
 * @version 11/06/2022
 *
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DataAnalysisLab {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // get user input
        System.out.print("Enter a data file to read: ");
        String fileName = input.nextLine();
        System.out.print("Enter the number of counties: ");
        int numberOfCounties = Integer.parseInt(input.nextLine());

        // start read file depend on the user input
        try {
            // read file depend on the input
            File file = new File(String.format("src/Project/DataAnalysisIntro/%s", fileName));
            Scanner readFile = new Scanner(file);
            // use while loop until the file don't hava other content
            ArrayList<String> counties = new ArrayList<String>();
            ArrayList<String> dataOf2010 = new ArrayList<String>();
            ArrayList<String> dataOf2019 = new ArrayList<String>();
            while (readFile.hasNext()) {
                String[] data = readFile.nextLine().split(",");
                // add data to arraylist
                counties.add(data[0]);
                dataOf2010.add(data[1]);
                dataOf2019.add(data[10]);
            }
            // remove first data
            counties.remove(0);
            dataOf2010.remove(0);
            dataOf2019.remove(0);
            // debug
            System.out.println("DEBUG: " + counties);
            System.out.println("DEBUG: " + dataOf2010);
            System.out.println("DEBUG: " + dataOf2019);
            // just depend on the user input number to make a for loop to print data
            for (int i = 0; i < numberOfCounties; i++){
                System.out.println(counties.get(i) + " " + (Integer.parseInt(dataOf2019.get(i)) - Integer.parseInt(dataOf2010.get(i))));
            }
            readFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("ERROR - File " + fileName + " not found!");
        }
    }
}

