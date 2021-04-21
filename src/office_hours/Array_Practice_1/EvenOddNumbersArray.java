package office_hours.Array_Practice_1;

import java.util.Arrays;

/*
Even and odd from array

Write a program that can count the even and odd number from an array of integers
Use for each to make it easier

Ex:
Input: [4,1,3,12,5]
Output: Even:2 Odd: 3
 */
public class EvenOddNumbersArray {
    public static void main(String[] args) {

        int[] nums = {4, 1, 3, 12, 5};
        int even = 0;
        int odd = 0;

        for (int each : nums) {

            if (each % 2 == 0) {
                even++;
            } else {
                odd++;
            }

        }
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);


    }
}