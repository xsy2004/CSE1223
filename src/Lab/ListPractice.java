package Lab;

/**
 *   A program that reads Strings from two files into Lists, then displays a
 *   "merged" list constructed from them in two different ways.
 *
 * @author Linus Xiong
 * @version 11/20/2022
 *
 */

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;

public class ListPractice {

    /**
     * Reads a list of words from a file - formatted one word per line - and
     * returns a List of those words in the order they appear in the file. If
     * there is an error reading the file, displays the error message "ERROR!
     * File wordsFile not found!" where "wordsFile" is the name of the file. If
     * there is an error reading the file, this method should return an empty
     * List.
     *
     * @param wordsFile
     *            The name of a file in the proper format containg the word list
     * @return a List of words read from the file
     */
    public static List<String> getList(String wordsFile) {
        ArrayList<String> result = new ArrayList<String>();
        // use try to catch file error
        try {
            File file = new File(String.format("src/Lab/FunWithLists/%s", wordsFile));
            Scanner readFile = new Scanner(file);
            while (readFile.hasNext()) {
                result.add(readFile.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("ERROR! File " + wordsFile + " not found!");
        }
        return result;
    }

    /**
     * Displays the contents of the list myList to the console. The list is
     * displayed with the index of the item, followed by a colon, then the item
     * with one item per line.
     *
     * @param myList
     *            the List to be displayed
     */
    private static void displayList(List<String> myList) {
        //Traverse the output
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(i + ": " + myList.get(i));
        }

    }

    /**
     * Creates a new List that holds the elements of list1 interleaved
     * with the elements of list2. For example, if list1 holds
     * <"over","river","through","woods"> and list2 holds <"the","and","the">,
     * then the new list should hold
     * <"over","the","river","and","through","the","woods">. Alternating between
     * list1 and list2. If one list is longer, the new list will contain all of
     * the extra values from the longer list at the end. For example, if list1
     * holds <"over","river","through","woods"> and list2 holds <"the","and">
     * then the new list should hold
     * <"over","the","river","and","through","woods">.
     *
     * @param list1
     *            the first list to merge
     * @param list2
     *            the second list to merge
     * @return list1 merged with list2 as described above
     */
    private static List<String> mergeLists(List<String> list1, List<String> list2) {
        ArrayList<String> meger = new ArrayList<String>();
        // use for loop to add alternately
        for (int i = 0; i < list1.size() + Math.abs(list1.size()-list2.size()); i++){
            if (i < list1.size()){
                meger.add(list1.get(i));
            }
            if (i < list2.size()){
                meger.add(list2.get(i));
            }

        }
        return meger;
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a filename: ");
        String fname = keyboard.nextLine();
        List<String> list1 = getList(fname);
        System.out.print("Enter another: ");
        fname = keyboard.nextLine();
        List<String> list2 = getList(fname);

        System.out.println("Wordlist 1");
        System.out.println("----------");
        displayList(list1);

        System.out.println();
        System.out.println("Wordlist 2");
        System.out.println("----------");
        displayList(list2);
        System.out.println("\nList 1 merged with List 2\n" +
                "-------------------------\n");
        displayList(mergeLists(list1, list2));
        System.out.println("\nList 2 merged with List 1\n" +
                "-------------------------\n");
        displayList(mergeLists(list2, list1));
        keyboard.close();
    }

}
