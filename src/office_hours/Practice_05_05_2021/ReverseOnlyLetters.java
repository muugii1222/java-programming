package office_hours.Practice_05_05_2021;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseOnlyLetters {

    /*
    Create a method reverseNoSpec(String) that will reverse a string without affecting special characters

Given a string, that contains special character together with alphabets (‘a’ to ‘z’ and ‘A’ to ‘Z’), reverse the string in a way that special characters are not affected.
     */

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
//        System.out.println(reverseNoSpec(in.next()));
        System.out.println(reverseNoSpec("Ab,c,de!$"));



    }

    public static String reverseNoSpec(String str) {

        char[] letters = str.toCharArray(); //separate each element
        System.out.println(Arrays.toString(letters));

        //              declared another variable that can contains num
        for (int i = 0, j = letters.length-1; i <= letters.length/2; i++){

            if (Character.isLetter(letters[i])){

                for ( ; j >= 0; j--){

                    if(Character.isLetter(letters[j])){

                        char temp = letters[i];
                        letters[i] = letters[j];
                        letters[j--] = temp;
                        break;

                    }
                }
            }

        }

//        return Arrays.toString(letters).replace("[", "").replace("]", "").replace(", ", "");
        return String.valueOf(letters);
    }


}
