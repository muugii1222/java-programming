package mugi;

/*
Write a program that can print all the ODD numbers between 0 ~ 100 that can be divisible by 3 & 5

Write a program that can print all the EVEN numbers between 0 ~ 100 that can be divisible by 3 & 5
 */

public class LoopDivisibleBy {
    public static void main(String[] args) {

        for (int i = 0; i <= 100; i++){
            if (i % 2 == 1 && i % 15 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        for (int i = 1; i <= 100; i++){
            if (i % 2 == 0 && i % 15 == 0) {
                System.out.print(i + " ");
            }
        }


    }
}
