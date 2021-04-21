package day31_arrays;

import java.util.Arrays;    //or --> * everything
import java.util.Collections;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] nums = {2, 5, 6,8, 10, -2, 45, 55, 78, 65, 78, 34, 3, -9, 13};

        System.out.println(Arrays.toString(nums));

//        sort nums
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println("min value: " + nums[0]);                //first one will be min value
        System.out.println("max value: " + nums[nums.length-1]);    //last one will be max value


        String [] words = {"java", "python", "c++", "sql", "ruby", "javascript", "assembly"};

        System.out.println("[" + String.join(", ", words) + "]");  //WAY 1
        System.out.println(Arrays.toString(words));                         //WAY 2

        Arrays.sort(words); // ASCII table order
        System.out.println(Arrays.toString(words));

//        REVERSE ORDER
        Arrays.sort(words, Collections.reverseOrder());
        System.out.println(Arrays.toString(words));




    }
}
