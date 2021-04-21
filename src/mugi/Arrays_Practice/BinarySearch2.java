package mugi.Arrays_Practice;
import java.util.*;
public class BinarySearch2 {
    public static void main(String[] args) {
        int [] nums = {23, 45, 67, 78, 86, 91, 123};

        System.out.println(Arrays.binarySearch(nums, 78));
        System.out.println(Arrays.binarySearch(nums, 123));

        if (Arrays.binarySearch(nums, 67) >= 0 ) {
            System.out.println("present");
        } else {
            System.out.println("not present");
        }
    }
}
