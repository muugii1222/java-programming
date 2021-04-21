package mugi;

/*
Write a program that can calculate the sum of all the even numbers between 1 ~ 100

• Write a program that can calculate the sum of all the odd numbers between 1 ~ 100
 */

public class LoopsEvenOddNumbers {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
    }
}
