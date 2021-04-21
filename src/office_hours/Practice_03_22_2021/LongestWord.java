package office_hours.Practice_03_22_2021;
/*
Given three String variables of some text find and print the longest word that also contains 'a'

    Ex:
        "java"
        "mouse"
        "computer"
        Output: java
    Ex:
        "java"
        "mouse"
        "apples"
        Output: apples

Challenge: Instead of just checking for 'a' add another variable that can be used to check for any character.
 */
public class LongestWord {
    public static void main(String[] args) {
        String word1 = "java";
        String word2 = "mouse";
        String word3 = "computer";

        if (word1.length() > word2.length() && word1.length() > word3.length()) {
            if (word1.contains("a")) {
                System.out.println(word1);
            } else {

            }
        } else if (word2.length() > word1.length() && word2.length() > word3.length()) {
            if (word2.contains("a")) {
                System.out.println(word2);
            }
        } else if (word3.length() > word1.length() && word3.length() > word2.length())
            if (word3.contains("a")) {
                System.out.println(word3);
            }
    }
}
