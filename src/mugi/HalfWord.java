package mugi;
/*
Write a program that will print out first half of the word twice.

Example:

input: java
output: jaja

input: unity
output: unun
 */
public class HalfWord {
    public static void main(String[] args) {

        String word = "unity";

        System.out.println(word.substring(0,word.length()/2)+word.substring(0,word.length()/2));

    }
}
