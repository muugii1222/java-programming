package day40_arraylist;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(12);
        nums.add(33);
        nums.add(77);

        System.out.println("size = " + nums.size());
        System.out.println(nums);

//        read from ArrayList
        System.out.println("index 0 = " + nums.get(0));
        System.out.println("index 1 = " + nums.get(1));
        System.out.println("index 3 = " + nums.get(3));
//        System.out.println("index 4 = " + nums.get(4));  --> IndexOutOfBoundsException

        nums.remove(1);
        System.out.println(nums);


    }
}
