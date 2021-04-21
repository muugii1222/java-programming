package day24_loops;

import java.util.Scanner;

public class CountUntil {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number:");
        int numberToStop = scan.nextInt();
        int count = 1;

        while (count <= numberToStop){
            System.out.print(count + " ");
            count++;
        }
    }
}
