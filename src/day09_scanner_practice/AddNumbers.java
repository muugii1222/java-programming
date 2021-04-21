package day09_scanner_practice;

import java.util.Scanner; //1. import scanner class

public class AddNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //2. create scanner object
        System.out.println("Enter 2 numbers"); //3. ask question
        int num1 = scan.nextInt(); //4. declare variable
        int num2 = scan.nextInt();
        int sum = num1 + num2;
        System.out.println("Result:" + sum); //5. print it out


    }
}
