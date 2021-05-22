package mugi.unit3_Practice;

import java.util.ArrayList;

public class ArrayList111 {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(22);
        nums.add(32);
        nums.add(42);

        System.out.println(nums);
        System.out.println(nums.size());
        System.out.println(nums.get(2));
        System.out.println(nums.remove(1));
        System.out.println(nums);
        System.out.println(nums.isEmpty());
        System.out.println(nums.contains(12));
        nums.clear();
        System.out.println(nums);
        System.out.println(nums.isEmpty());
    }
}
