package day40_arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListLoop {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        System.out.println(nums);

//        ArrayList can hold duplicate
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        nums.add(40);
        nums.add(60);
        nums.add(70);
        nums.add(70);
        nums.add(90);
        nums.add(100);
        System.out.println(nums);
        nums.remove(0);
        System.out.println(nums);

//        nums.remove(20); --> index 20 is not here so,
//        System.out.println(nums); // IndexOutOfBoundsException

        nums.remove(new Integer(20)); // --> remove value of 20
        System.out.println(nums);

//        for loop, and print all in the same line
        System.out.println("For loop");
        for (int i = 0; i < nums.size(); i++){
            System.out.print(nums.get(i) + ", ");
        }

        System.out.println();
        System.out.println("For each loop");

//        for each loop, and print all in the same line
        for (int each : nums){  //Integer each, int each both works
            System.out.print(each + ", ");

        }

    }
}
