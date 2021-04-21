package office_hours.Practice_03_24_2021;

/*
Given a String, write a program to display the middle character of a string

a) If the length of the string is even there will be two middle characters.

b) If the length of the string is odd there will be one middle character. Ex:

Input: elephant Output: The middle characters: ph
 */

import java.util.Scanner;

public class MiddleChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.next();

        if (str.length() % 2 == 0){
            int index = str.length()/2;
            System.out.println(str.charAt(index-1) + "" + str.charAt(index));  // can use both ways
            System.out.println(str.substring(index-1, index + 1));

        } else if (str.length() % 2 == 1){
            System.out.println(str.charAt(str.length()/2));
            System.out.println(str.substring(str.length()/2, str.length()/2 + 1));
        }


    }
}
