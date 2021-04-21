package mugi.Arrays_Practice;

import java.util.Arrays;
import java.util.Collections;

public class ArraysUtil2 {
    public static void main(String[] args) {

        int [] nums = {100, 5, 1, 7, 0, -4, 44, 33};
        System.out.println(Arrays.toString(nums));

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        System.out.println(nums[0]);
        System.out.println(nums[nums.length-1]);

        String [] words = {"java", "python", "c++", "sql", "ruby", "javascript"};

        System.out.println(Arrays.toString(words));
        System.out.println("["+ String.join(", ", words)+"]");

        Arrays.sort(words);
        System.out.println(Arrays.toString(words));

        Arrays.sort(words, Collections.reverseOrder());
        System.out.println(Arrays.toString(words));
    }
}
