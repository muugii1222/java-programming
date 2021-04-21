package day25_loops;

import java.util.Scanner;

public class StartEnd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Start and end number:");
        int start = scan.nextInt();
        int end = scan.nextInt();

        for (int i = start; i <= end; i++){
            System.out.print(i + " ");
        }

        if (start > end){
            System.out.println("Reverse numbering is not supported");
        }

    }
}
