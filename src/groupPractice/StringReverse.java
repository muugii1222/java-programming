package groupPractice;

/*
* Write a method that will accept String and return a reversed String
 (by using 2 methods { using StringBuilder}, {using loop [while and for], concatenation and empty String}

1)	Reverse String only if this String includes from 2 to 20 letters                            done
2)	Reverse String, if that String includes digital ->delete them (digital)
3)	Reverse String and to lowercase the new String and put new String into “   “                done
4)	String that is accepted by method must be randomly generated (Random class or other ways)   done
5)	Reverse String, if that String includes special characters and numbers -> delete them
*/

import java.util.Random;

public class StringReverse {
    public static void main(String[] args) {

        System.out.println(reverse(random()));
    }

    public static String reverse (String str){
        String reversedStr = "";

        if (str.length()>=20 && str.length()<=2){
            return "error";
        } else {
            for (int i=str.length()-1; i>=0; i--){
                reversedStr += str.charAt(i);
            }
            return "\"" + reversedStr.toLowerCase() + "\"";
        }

    }

    public static String random (){
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        return generatedString;
    }
}
