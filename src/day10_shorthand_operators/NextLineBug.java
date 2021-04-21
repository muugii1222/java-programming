package day10_shorthand_operators;

import java.util.Scanner;

public class NextLineBug {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How much is the rent?");
        double rent = scan.nextDouble();
        scan.nextLine(); //fix the bug
        String month = scan.nextLine();
        System.out.println("rent = " + rent);
        System.out.println("month = " + month);

    }
}
