package mugi.ArrayListPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListPractice {
    public static void main(String[] args) {
        methodA(12);

        int[] num = {1, 2, 3, 4};
        methodA(num);

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(123, 234, 345));
//        nums.add(123);
//        nums.add(234);
//        nums.add(345);
        methodA(nums);

        List<Integer> numbers = new ArrayList<>(Arrays.asList(12, 22, 32));
        methodA(numbers);

        System.out.println(methodB());

        System.out.println(Arrays.toString(methodC()));

        System.out.println(methodD());





    }

    public static void methodA (int n){
        System.out.println(n);
    }

    public static void methodA (int[] n){
        System.out.println(Arrays.toString(n));
    }

    public static void methodA (ArrayList<Integer> n){
        System.out.println(n);
    }

    public static void methodA (List<Integer> n){
        System.out.println(n);
    }

    public static int methodB () {
        return 5;
    }

    public static int[] methodC (){
        int [] num = {3, 2, 1};
        return num;
    }

    public static List<Integer> methodD (){
        List<Integer> Listnums = new ArrayList<>(Arrays.asList(1222, 2333, 3444));
        return Listnums;
    }


}
