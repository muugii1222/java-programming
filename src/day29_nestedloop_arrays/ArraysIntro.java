package day29_nestedloop_arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        int num = 1; //single variable

/**
                WAY 1
 */

        // 1. DECLARE VARIABLES
         int [] nums = new int [3]; //multiple variables --> array variables

        // 2. ASSIGN
        //    | index position
        nums [0] = 5;
        nums [1] = 7;
        nums [2] = 10;


        // 3. PRINT
        System.out.println("value at index 0 = " + nums[0]);    // index 0
        System.out.println("value at index 1 = " + nums[1]);    // index 1
        System.out.println("value at index 2 = " + nums[2]);    // index 2



        //we can also use int variable to specify index number
        int i = 0;
        System.out.println(nums[i]);
        i++;
        System.out.println(nums[i]);

        //how to find out the size of the array
        System.out.println("number of elements = " + nums.length);
        //store length of array into len variable
        int len = nums.length;
        System.out.println("len = " + len);

        //change values in array
        nums [0] = 100;
        nums [1] = 200;
        nums [2] = nums [1];
        System.out.println("nums [0] = " + nums [0]);
        System.out.println("nums [1] = " + nums [1]);
        System.out.println("nums [2] = " + nums [2]);



    }
}
