package office_hours.Practice_03_24_2021;
/*
Ask user to enter two strings. Both of these strings should be at least 6 character long. If they are shorter than that print “Invalid data” and program should end.

If the information provided is valid, you will take the first 4 characters of first string and combine them with the last three characters of the second string. At the end of your combined string add “@cybertek.com” and print the final string as your created email. The final email should be in all lowercase.

input:

JamesBond Secret output:

jameret@cybertek.com
 */

import java.util.Scanner;

public class CreatingEmail {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Enter 2 words:");
        String word1 = scan.nextLine();
        String word2 = scan.nextLine();

        if (word1.length() >= 6 && word2.length() >= 6){
            System.out.println(word1.substring(0 , 4).toLowerCase() + word2.substring(word1.length()-3).toLowerCase() + "@cybertek.com");

        } else if (word1.length() < 6 && word2.length() < 6){
            System.out.println("Invalid data");

        }

    }
}
