package office_hours.Practice_03_12_2021_IfStatement;

import java.util.Scanner;

/*
[If statements, operators]

Write a program that will accept your salary amount.
Then also ask the user if they are full time or not (boolean).
If they are fulltime add 20000 to their salary, but if they are part
time then subtract 5000. Print the final salary.
 */

public class Salary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double salary = scan.nextDouble();
        boolean isFullTime = false;

        if (isFullTime) {
            System.out.println("Total salary: $" + (salary + 20_000));
        } else {
            System.out.println("Total salary: $" + (salary - 5000));
        }
    }
}
