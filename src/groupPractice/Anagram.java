package groupPractice;

/*
* Two strings which are called anagrams if they contain all the same characters in the same frequencies. For this challenge, the test is not case-sensitive. For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.
*/

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("cat", "act"));

        /** WAY 2 */

        String a = "anagram";
        String b = "margana";

        a = a.toLowerCase();
        b = b.toLowerCase();

        if (a.length() != b.length()){
            System.out.println(false);
        } else {
            for (int i=0; i<a.length(); i++){
                b = b.replaceFirst(a.charAt(i) + "", "");
            }
            System.out.println(b.equals("")); // if b is empty that means a = b
        }




    }


    /** WAY 1 */
    public static boolean isAnagram(String word1, String word2){

        char[] word1Array = word1.toCharArray();
        char[] word2Array = word2.toCharArray();

        if (word1Array.length != word2Array.length){
            return false;

        } else {
            Arrays.sort(word1Array);
            Arrays.sort(word2Array);

            return Arrays.equals(word1Array, word2Array);

        }
    }




}