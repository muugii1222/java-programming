package office_hours.Practice_03_24_2021;

/*
Given two words. Print the first word without its first character then print the second word without its last character.

Input:

apple banana

Output:

pple banan

 */
public class RemoveFirstAndLast {
    public static void main(String[] args) {

        String word1 = "apple";
        String word2 = "banana";

        System.out.println(word1.substring(1) + " " + word2.substring(0, 5));

    }
}
