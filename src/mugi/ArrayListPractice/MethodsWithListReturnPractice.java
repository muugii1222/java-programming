package mugi.ArrayListPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodsWithListReturnPractice {
    public static void main(String[] args) {

        System.out.println(getIntegerList());

        System.out.println(Arrays.toString(getIntegerArray()));

    }

    /**
     * getIntegerList
     * No params
     * return List<Integer>
     * Loop from 0 - 1000_000
     * and add to arraylist then return it
     */

    public static List<Integer> getIntegerList (){
        List<Integer> nums = new ArrayList<>();
        for (int i=1; i<1000_001; i++){
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

    public static int[] getIntegerArray (){
        int [] nums = new int[1000_001];

        for (int i=1; i<1000_000; i++){
            nums[i] = i;
        }
       return nums;

    }
}
