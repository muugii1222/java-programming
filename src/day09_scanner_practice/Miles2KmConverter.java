package day09_scanner_practice;


import java.util.Scanner;

/*
add new class Miles2KmConverter
add main method
import scanner
create scanner object
miles, kilometers

Enter miles:
10
10 miles in kilometer: 16.0934

---------
formula:
kilometers -> miles * 1.609

 */
public class Miles2KmConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("***** Mile to Kilometer *****");
        System.out.println("Enter miles:");
        double miles = scan.nextDouble();
        double kilometers = miles * 1.609;
        System.out.println(miles +  " miles in kilometers: " + kilometers);

    }
}
