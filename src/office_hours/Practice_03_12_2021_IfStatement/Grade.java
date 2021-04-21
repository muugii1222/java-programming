package office_hours.Practice_03_12_2021_IfStatement;
import java.util.Scanner;
/*
[If statements, operators]

Write a program that will give the grade after the retake.
The program should read a score of the test and which attempt it was.

    If its the first attempt -> subtract 10%
    If its the second attempt -> subtract 20%
    If its the third attempt -> subtract 35%
 */
public class Grade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the test score:");
        double grade = scan.nextDouble();
        double firstAttempt = 100 - 100 * 0.1;
        double secondAttempt = 100 - 100 * 0.2;
        double thirdAttempt = 100 - 100 * 0.3;

        if (grade >= firstAttempt) {
            System.out.println("First Attempt");
        } else if (grade >= secondAttempt && grade <=firstAttempt) {
            System.out.println("Second Attempt");
        } else if (grade >= thirdAttempt && grade <=secondAttempt) {
            System.out.println("Third Attempt");
        }


    }
}
