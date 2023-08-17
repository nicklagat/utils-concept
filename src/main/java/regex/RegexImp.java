package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexImp {
    static String ran = "Life|Like";

    /**
     *  ?: indicates zero or one occurrences of the preceding element
     *
     *  *: indicates zero or more occurrences of the preceding element
     *
     *  +: indicates one or more occurrences of the preceding element
     *
     *  {1}: indicates the number of occurrences the preceding items should match to
     *
     *  a.b: indicates any string that starts with 'a'. ends with 'b' and is composed of 3 letters fits this pattern
     *
     *  a.*b: indicates matches any string that contains an 'a.' and then a 'b' at some later point
     *
     *  [abc]: indicates it will match any of the characters 'a','b', or 'c'
     *
     *  [^abc]: indicates it will match any other characters except 'a','b', or 'c'
     *
     *  [a-z]: indicates matches any single character in the range a-z
     *
     *  [^a-z]: indicates matches all characters except the ones present in this range
     *
     *  [A-Z]: same as the lowercase explanation
     *
     *  [^A-Z]: same as the lowercase explanation
     *
     * \s: represents a whitespace
     *
     * \S: represents any none whitespace
     *
     * \d: represents any digit
     *
     * \D: represents any none digit character
     *
     * \w: represents any word(letter or digit)
     *
     * \W: represents any non word character
     *
     * $: marks the end of a string
     *
     * ^: asserts the start of a string
     * */


    /**
     * The regex API in java contains two classes Pattern and Matcher
     * To create a pattern we must invoke its public static compile method which will return a pattern object
     * The method accepts a regular expression as an argument
     * <p>
     * <p>
     * The matcher interprets the pattern and performs the match operation against an input string
     * To obtain a macther object we have to invoke the matcher method on a pattern object
     */

    public static void main(String[] args) {


        Pattern pattern = Pattern.compile("a+b");
        Matcher matcher = pattern.matcher("aaaab");
        System.out.println(matcher.find());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your phone number: ");

        String input = scanner.nextLine();

        System.out.println(checkNumber(input));




    }


    public static boolean checkNumber(String input) {
        Pattern pattern1 = Pattern.compile("^\\+49\\d{8}$");
        Matcher matcher1 = pattern1.matcher(input);
        try {
            if (matcher1.find()) {
                System.out.println("You have entered a valid Phone Number: " + input);
                return true;
            } else {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid Phone Number, Please check your number and try again: " + input);
            return false;

        }
    }


}
