package day21_string_manupulation;

public class FirstAndLastTest {
    public static void main(String[] args) {
        String word1 = "MOM";
        char first = word1.charAt(0);
        char last = word1.charAt(2);

        if (first == last) {
            System.out.println("first and last letters match");
        } else {
            System.out.println("first and last letters mismatch");
        }

        String name = "aziza";
        char firstLetter = name.charAt(0);
//        int count = name.length();
//        char lastLetter = name.charAt(count-1);
//        char lastLetter = name.charAt(count--);      * we can do this way *

//        WITHOUT COUNT HOW TO PRINT LAST LETTER?      * this way is more common *
        char lastLetter = name.charAt(name.length()-1);
        System.out.println(firstLetter);
        System.out.println(lastLetter);

        if (firstLetter == lastLetter){
            System.out.println(name + " - first and last match");
        } else {
            System.out.println(name + " - first and last mismatch");
        }

    }
}
