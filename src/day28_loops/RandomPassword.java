package day28_loops;

import java.util.Random;

import java.util.Scanner;


public class RandomPassword {
    public static void main(String[] args) {

        String source = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789_!@#$%^&*";
        int password = 8;
        Random random = new Random();

        for (int i = 1; i < 8; i++) {
            System.out.println(random.nextInt(21));// numbers

            int index = random.nextInt(71);
            System.out.print(source.charAt(index));
            password += source.charAt(index);
        }
        System.out.println("\nYour password = " + password);

    }
}