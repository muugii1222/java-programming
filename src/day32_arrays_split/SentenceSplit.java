package day32_arrays_split;

import java.util.Arrays;

public class SentenceSplit {
    public static void main(String[] args) {
        String sentence = "java is fun";
        String[] words = sentence.split(" ");

        System.out.println(Arrays.toString(words));
        System.out.println(words[0]);
        System.out.println(words[1]);
        System.out.println(words[2]);
//        System.out.println(words[3]); Array length is only 3\

        for (String each : words){
            System.out.println(each);
        }

        String googleResult = "About 1,810,000 results (0.68 seconds)";
        String [] split = googleResult.split(" ");
        System.out.println(split[1]);
        System.out.println(split[3].replace("(", " "));

        System.out.println(googleResult.split(" ")[1]); //short way

    }
}
