package office_hours.Practice_03_24_2021;

/*
Given a person's name in a String (first and last name), then prints out the initials of the user. The initials should be uppercase.

Ex:
input: james bond output: your initials are JB
 */

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String fullName = scan.nextLine();
        String firstName = fullName.substring(0 , fullName.indexOf(" "));
        String lastName = fullName.substring(fullName.indexOf(" ")-1);

        System.out.println(fullName.toUpperCase().charAt(0)+""+fullName.toUpperCase().substring(fullName.indexOf(" ")+1));
    }
}
