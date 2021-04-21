package mugi.Arrays_Practice;

import java.sql.SQLOutput;
import java.util.Arrays;

public class ReverseArray_Practice {
    public static void main(String[] args) {
        int [] nums = {5, 10, 4, 100, 56, 66, 45};

        System.out.println("before " + Arrays.toString(nums));

        int [] reverseNums = new int [nums.length];

//        WAY 1 --> USING TEMP VARIABLE TO REVERSE STRING ARRAY
        for (int i = 0; i < nums.length/2; i++){
            int temp = nums[i];
            nums[i] = nums[nums.length-1-i];
            nums[nums.length-1-i] = temp;
        }
        System.out.println("After " + Arrays.toString(nums));

//        WAY 2 --> USING FOR LOOP WITH 2 VARIABLES

        for (int i = nums.length-1, j = 0; i >= 0; i--, j++){
            reverseNums[j] = nums[i];

        }
        System.out.println("Before reverse " + Arrays.toString(nums));
        System.out.println("After reverse " + Arrays.toString(reverseNums));

//      ex1:  REVERSE STRING USING FOR LOOP WITH 2 VARIABLES

        String[] words = {"bagi", "mugi", "anir", "tamir", "babyboy"};

        System.out.println("Before " + Arrays.toString(words));

        String [] reverseWord = new String[words.length];

        for (int i = words.length-1, j = 0; i >= 0; i--, j++){
            reverseWord[j] = words[i];
        }

        System.out.println("After " + Arrays.toString(reverseWord));

//      ex2:

        String[] fruits= {"kiwi", "apple", "banana", "grapes", "strawberry"};

        System.out.println("before " + Arrays.toString(fruits));

        String [] reverseFruits = new String[fruits.length];

        for (int i = fruits.length-1, j = 0; i >=0; i--, j++){
            reverseFruits[j] = fruits [i];
        }
        System.out.println("after " + Arrays.toString(reverseFruits));

    }
}
