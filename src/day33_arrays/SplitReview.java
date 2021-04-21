package day33_arrays;

import java.util.*;

public class SplitReview {
    public static void main(String[] args) {
        String word = "java";

        String [] array = word.split("a");
        System.out.println(Arrays.toString(array));

        System.out.println(word.length());
        System.out.println(array.length);
        int countOfA = array.length-1;
        if (word.endsWith("a")){
            countOfA++;
        }
        System.out.println("countOfA = " + countOfA);

        System.out.println("-----Split with empty string-----");
        String [] str = word.split("");
        System.out.println(Arrays.toString(str));

//        REGULAR EXPRESSION
        String word2 = "java1sql2html";
        String [] wordArr = word2.split("\\d");
        System.out.println(Arrays.toString(wordArr));

        word2 = word2.replaceAll("\\d", "_");
        System.out.println("word2 = " + word2);


//        EX: format copied from Google
        String password = "bcTd123_5";
        if(password.matches("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^_&+=]).*$")) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }



    }
}
