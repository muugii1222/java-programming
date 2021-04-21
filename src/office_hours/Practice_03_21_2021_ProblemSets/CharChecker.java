package office_hours.Practice_03_21_2021_ProblemSets;
/*
[Character Checker]

Given a letter (char) determine if the character is an uppercase letter or lowercase letter Ex: 'b' --> lowercase 'G' --> uppercase 'O' --> uppercase

Hint: Use the ASCII table
 */
import java.util.Scanner;
public class CharChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a character");
        char letter = input.next().charAt(0);

        if (letter >= 'A' && letter <= 'Z'){ //(letter >= '65' && letter <= '90')
            System.out.println(letter + " is uppercase letter");
        } else if (letter >= 'a' && letter <= 'z'){ //(letter >= '97' && letter <= '122'){
            System.out.println(letter + " is lowercase letter");
        } else {
            System.out.println("Not a valid letter");
        }
    }
}
