package day09_scanner_practice;

import java.util.Scanner;

public class Fahrenheit2Celsius {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("***** Fahrenheit to Celsius *****");
            System.out.println("Enter Fahrenheit:");
            double fahrenheit = scan.nextDouble();
            double celsius = (fahrenheit - 32) * 5/9; //formula
            System.out.println(fahrenheit + " F Fahrenheit to Celsius: C " + celsius);

        }
    }