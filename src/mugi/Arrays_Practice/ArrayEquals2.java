package mugi.Arrays_Practice;
import java.util.*;
public class ArrayEquals2 {
    public static void main(String[] args) {
        int[] nums1 = {4, 5, 2, 10};
        int[] nums2 = {4, 5, 2, 10};
        int[] nums3 = {10, 4, 5, 2};
        int[] nums4 = {4, 5, 2, 10, 90};
        int[] nums5 = {54, 23, 54, 123, 54};

        String[] cars1 = {"Toyota","Honda", "Tesla","BMW", "Dodge"};
        String[] cars2 = {"Toyota","Honda", "Tesla","BMW", "Dodge"};
        String[] cars3 = {"toyota","honda", "tesla","bmw", "dodge"};
        String[] cars4 = {"Toyota","Honda", "Tesla"};

        System.out.println("num1 = num2: " + Arrays.equals(nums1, nums2));
        System.out.println("cars1 = cars2: " + Arrays.equals(cars1, cars2));

        if (Arrays.equals(nums3, nums2)){
            System.out.println("num1 & num2 match");
        } else {
            System.out.println("mismatch");
        }



    }
}
