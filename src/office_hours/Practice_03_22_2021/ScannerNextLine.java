package office_hours.Practice_03_22_2021;

import java.util.Scanner;

public class ScannerNextLine {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

//        next() vs nextLine()
       /*
       next() -> it will read only word before space
       nextLine() -> it will read multiple word until enter
        */

        System.out.println("Enter your number?");
        int number = input.nextInt();
        System.out.println("Enter your name?");
        input.nextLine();               // 2. to fix the problem put extra
        String name = input.nextLine(); // 1. if to put any variable before nextLine() it doesn't accept
        System.out.println(name + " likes number " + number);


    }
}
