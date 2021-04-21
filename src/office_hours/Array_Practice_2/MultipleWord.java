package office_hours.Array_Practice_2;

import java.util.Arrays;

/*
Multiple Words

Given a String of words that are separate by commas. Find and print any words that have more than one word

Example Input: "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer”

Output: wooden spoons trash can dish washer
 */
public class MultipleWord {
    public static void main(String[] args) {
        String words = "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer";
        String duplicate = "";

        String [] wordArr = words.split(",");
//        System.out.println(Arrays.toString(wordArr));

        for (String each : wordArr){
            if (each.trim().contains(" ")){
                duplicate += each;
            }
        }
        System.out.println(duplicate);
    }
}
