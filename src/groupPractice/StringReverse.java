package groupPractice;

/*
* Write a method that will accept String and return a reversed String
 (by using 2 methods { using StringBuilder}, {using loop [while and for], concatenation and empty String}

1)	Reverse String only if this String includes from 2 to 20 letters
2)	Reverse String, if that String includes digital ->delete them (digital)
3)	Reverse String and to lowercase the new String and put new String into “   “
4)	String that is accepted by method must be randomly generated (Random class or other ways)
5)	Reverse String, if that String includes special characters and numbers -> delete them
*
*/

import java.util.Random;

public class StringReverse {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(reverse(random.));
    }


    public static String reverse (String str){
        String reversedStr = "";

        if (str.contains("digital") && str.length()<=20 || str.length()>=2){
            for (int i=str.length()-1; i>=0; i--){
                reversedStr += str.charAt(i);
            }
            return "\"" + reversedStr.toLowerCase() + "\"";
        } else {
            return "error";
        }

    }
}