package office_hours.Loop_Practice_2;

/*
[IQ] Palindrome

A word that is the same read forwards and backwards. User takes a word from the console. Print true if the word is a palindrome. Print false if the word is not palindrome.

-> input: civic
-> output: true

-> input: java
-> output: false

 */

public class Palindrome2 {
    public static void main(String[] args) {

        String word = "civic";
        boolean isPalindrome = true;

        //Q: What if your String has million characters

        for (int i = 0; i < word.length()/2; i++) {

            if (word.charAt(i) != word.charAt(word.length()-1-i)) { //mean point is find not matching point first
                isPalindrome = false;
                break;
            }
        }

        System.out.println(isPalindrome);

    }
}
