package day38_methods;

import java.util.Arrays;

public class ArrayUtilsTest {
    public static void main(String[] args) {
        int[] nums = {5, 23, 1, 53, 90};

        ArrayUtils.printArray(nums);
        ArrayUtils.printArray(new int[]{23, 65, 45, 67, 87}); //also okay

        System.out.println(ArrayUtils.sum(nums));
        System.out.println(ArrayUtils.sum(new int[]{23, 65, 45, 67, 87}));

        System.out.println(ArrayUtils.contains(nums, 23));

    }
}