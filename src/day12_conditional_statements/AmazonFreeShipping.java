package day12_conditional_statements;

import java.util.Scanner;

public class AmazonFreeShipping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter total price");
        double totalPrice = scan.nextDouble();

        if (totalPrice >= 18) {
            System.out.println("Free shipping is eligible");
        } else {
            System.out.println("Free shipping is not eligible");
        }
    }
}
