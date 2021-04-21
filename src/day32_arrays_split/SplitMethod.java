package day32_arrays_split;

import java.util.*;

public class SplitMethod {
    public static void main(String[] args) {

//                        0     1       2     3
        String words = "java:python:selenium:html";

        String [] wordsArray = words.split(":");

        System.out.println(Arrays.toString(wordsArray));
        System.out.println(wordsArray.length);

        for (String each : wordsArray){
            System.out.println(each);
        }

        String sentence = "today I am coding java arrays";

        String [] sentenceArray = sentence.split(" ");
        System.out.println(Arrays.toString(sentenceArray));
        System.out.println(sentenceArray.length);

//        PRINT EVERY WORD
        for (String each : sentenceArray){
            System.out.println(each);
        }

//        PRINT FIRST WORD
        System.out.println(sentenceArray[0]);
        System.out.println(sentence.split(" ")[0]); // SAME




    }
}
