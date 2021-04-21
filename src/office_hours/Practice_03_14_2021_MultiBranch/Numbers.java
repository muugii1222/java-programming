package office_hours.Practice_03_14_2021_MultiBranch;
/*
Write a java program that accepts three numbers and return the
minimum number (assume that none of them are equal)
 */
import java.util.Scanner;
public class Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("The biggest number from " + num1 + ", " + num2 +
                    ", and " + num3 + " is: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("The biggest number from " + num1 + ", " + num2 +
                    ", and " + num3 + " is: " + num2);
        } else if (num3 > num1 && num3 > num1) {
            System.out.println("The biggest number from " + num1 + ", " + num2 +
                    ", and " + num3 + " is: " + num3);
        }

    }

}
