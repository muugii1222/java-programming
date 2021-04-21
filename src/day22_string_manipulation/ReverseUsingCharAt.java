package day22_string_manipulation;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.lang.*; //String import automatically added even can't see we don't have to write JUST REMEMBER

public class ReverseUsingCharAt {
    public static void main(String[] args) {

        String word = "java";
// to concatenation -> can put "" anywhere except last
        System.out.println("" + word.charAt(3) + word.charAt(2) + word.charAt(1) + word.charAt(0));

        System.out.println(word);

        String word2 = "" + word.charAt(3) + word.charAt(2) + word.charAt(1) + word.charAt(0);

        System.out.println(word2);

        if (word.equalsIgnoreCase(word2)) {
            System.out.println("Palindrome word");
        } else {
            System.out.println("Not palindrome word");
        }
    }
}
