package day43_list_custom_classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodsWithListReturn {
    public static void main(String[] args) {
//        Calculate running time
        long start = System.nanoTime();

        List<Integer> mlnNums = getIntegerList();
//        System.out.println(mlnNums);
        long end = System.nanoTime();
        System.out.println("ArrayList time = " + (end - start));

        long st =  System.nanoTime();
       int[] arr = getIntegerArray();
//        System.out.println(Arrays.toString(arr));
        long en = System.nanoTime();
        System.out.println("Array time = " + (en - st));

    }

    /**
     * getIntegerList
     * No params
     * return List<Integer>
     * Loop from 0 - 1000_000
     * and add to arraylist then return it
     */

    public static List<Integer> getIntegerList(){

        List<Integer> nums = new ArrayList<>();

        for (int i = 0; i<=1_000_000; i++){
            nums.add(i);
        }

       return nums;
    }


    /**
     * getIntegerArray
     * No params
     * return int[]
     * Loop from 0 - 1000_000
     * and add to int[] then return it
     */

    public static int[] getIntegerArray(){

        int[] nums = new int[1_000_001];

        for (int i = 0; i<=1_000_000; i++){
            nums[i] = i;
        }

        return nums;
    }



}
