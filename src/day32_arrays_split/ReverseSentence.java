package day32_arrays_split;

import java.util.Arrays;

public class ReverseSentence {
    public static void main(String[] args) {

//        WAY 1

        String sentence = "today is java class day";

        String [] words = sentence.split(" ");

        for (int i = words.length-1; i >= 0; i--){
            System.out.print(words[i]+" ");
        }

//        WAY 2 --> using storage

        String reversed = "";

        for (int i = words.length-1; i >= 0; i--){

            reversed += words[i] + " ";
        }
        System.out.println("\n" + reversed);
    }
}
