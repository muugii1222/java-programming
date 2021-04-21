package day35_methods_with_param;

import java.util.Scanner;

public class MultipleParams {
    public static void main(String[] args) {

//        WHEN USE SCANNER

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        double d1 = scan.nextDouble();
        double d2 = scan.nextDouble();
        showSum(d1, d2);

//        HARD CODED
        showSum(467.34, 893.54);
    }

    public static void showSum (double num1, double num2){
        System.out.println(num1+num2);
    }
}
