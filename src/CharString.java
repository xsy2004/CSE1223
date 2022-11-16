/**
 * this code shows use of string methods
 *  and how to extract character from it
 *  for integer and double
 *  as well as data conversion
 * @author Nima Mansouri
 * @version 20220907
 */
public class CharString
{
    public static void main(String[] args)
    {
        //variable declaration
        char    c1;
        String  str1 = "apple is my favorite fruit",
                str2 = "Apple is my favorite fruit",
                str3 = "banana is my favorite fruit";

        //length
        System.out.println("length of strings: " + str1.length());


        //compares str1 and str2, str1 and str3, str1 and str2 ignore case
        System.out.println("str1 and str2 are equal: " + str1.compareTo(str2));
        System.out.println("str1 and str3 are equal: " + str1.compareTo(str3));
        System.out.println("str1 and str2 are equal: " + str1.compareToIgnoreCase(str2));
        //concatenate
        System.out.println("str1 + str3: " + str1 + " " + str3);
        //extract first 5 characters of str1
        System.out.println("str1 substring_1: " + str1.substring(0,5));
        //extract from texts from 5th character
        System.out.println("str1 substring_2: " + str1.substring(5));
        //find index of "fa" in str1
        System.out.println("index of fa in str1: " + str1.indexOf("fa"));
        //display str1 in lowercase and uppercase
        System.out.println("lower case str1: " + str1.toLowerCase());
        System.out.println("upper case str1: " + str1.toUpperCase());
        //what is the 3rd character of str1? display it
        //c1 = str1.;
        //System.out.println("third character of str1 is: " + c1);

    }
}