package mugi;

import java.util.Arrays;

public class FirstAndLastLetter {
    public static void main(String[] args) {
        String[] words = {"hello", "why", "by", "apple" , "note"};
        String parts = "";

        for (int i = 0; i < words.length; i++){
            parts+=" "+words[i].charAt(0)+words[i].charAt(words[i].length()-1);


        }
        System.out.println(parts.trim());
            String [] partsArr = parts.trim().split(" ");

            System.out.print(Arrays.toString(partsArr).trim());

        }


    }

