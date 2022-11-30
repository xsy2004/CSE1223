package Lab;

/**
 * A class that implements a very simplified StringBuilder-like class.  This
 * class will not execute on its own - you will need to use code provided in
 * the TestSimpleStringBuilder.java class to run this code.
 *
 * @author Linus Xiong
 * @version 11/20/2022
 *
 */
import java.util.ArrayList;
import java.util.List;

public class SimpleStringBuilder {

    /**
     * A private member variable used to hold the internal state of the
     * SimpleStringBuilder. This List holds the characters of the String that
     * will be built. So the String "Hello" would be represented by an List
     * containing the characters ['H', 'e', 'l', 'l', 'o'].
     */
    List<Character> list;

    /**
     *
     */
    private void createEmptyBuilder() {
        this.list = new ArrayList<>();
    }

    /**
     * Constructs an empty SimpleStringBuilder.
     *
     */
    public SimpleStringBuilder() {
        this.createEmptyBuilder();
    }

    /**
     * Constructs a SimpleStringBuilder that contains the same characters as the
     * String input
     *
     * @param input
     *            the String to copy into the StringBuilder
     */
    public SimpleStringBuilder(String input) {
        this.createEmptyBuilder();

        for (int i = 0; i < input.length(); i++) {
            this.list.add(input.charAt(i));
        }
    }

    /**
     * Returns a String object built from the SimpleStringBuilder characters.
     * (Note that this is not terribly efficient, and not how the Java library
     * actually would do it).
     *
     * @return the value of the SimpleStringBuilder as a String
     */
    @Override
    public String toString() {

        String myString = "";
        for (int i = 0; i < this.list.size(); i++) {
            myString = myString + this.list.get(i);
        }
        return myString;
    }

    /**
     * Returns the character at position i
     *
     * @param i
     *            the index to be checked
     * @return the character at position i
     */
    public char charAt(int i) {
        return this.list.get(i);
    }

    /**
     * Returns the length of the SimpleStringBuilder object
     *
     * @return the length of the StringBuilder
     */
    public int length() {
        return this.list.size();
    }

    /**
     * Replaces the character at position i with the character c
     *
     * @param i
     *            index to be replaced
     * @param c
     *            character to use in replacement
     */
    public void replaceCharAt(int i, char c) {
        this.list.remove(i);
        this.list.add(i, c);


    }

    /**
     * Appends the character c to the end of the StringBuilder
     *
     * @param c
     *            character to append
     */
    public void append(char c) {
        this.list.add(c);

    }

    /**
     * Inserts the character c at position i
     *
     * @param i
     *            index to insert at
     * @param c
     *            character to be inserted
     */
    public void insert(int i, char c) {
        this.list.add(i, c);

    }

    /**
     * Deletes the character at position i
     *
     * @param i
     *            index to delete
     */
    public void deleteCharAt(int i) {
        this.list.remove(i);

    }
}
