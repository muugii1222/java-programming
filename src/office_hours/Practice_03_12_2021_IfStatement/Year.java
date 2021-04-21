package office_hours.Practice_03_12_2021_IfStatement;
import java.util.Scanner;
/*
[If statements, operators]

Create a program that will accept a year. Check if the year is a leap year.
If it is a leap year print "$year is a leap year" otherwise print "$year is not a leap year"

Hint: Lets say if a number is evenly divisible by 4 it is a leap year

 */
public class Year {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        int leapYear = year % 4;

        if (leapYear == 0) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }


    }

}
