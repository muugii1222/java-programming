package day42_arraylist;

import java.util.*;

public class MethodWithList {
    public static void main(String[] args) {

//        declare arraylist and add values
        List<String> words  = new ArrayList<>(Arrays.asList("java", "html", "selenium", "a", "input", "title"));
        printStrList(words);

        List<Integer> nums = new ArrayList<>(Arrays.asList(2, 3, 4, 5, 6));
        System.out.println(sumIntegerList(nums));


    }

    /*
    method name: printStrList
    param: List of String
    return: void
    print: all values separated by space
     */

    public static void printStrList (List<String> str){
        for (String each : str){
            System.out.print(each + " ");
        }
        System.out.println();
    }

    /*
    method name: sumIntegerList
    param: List of Integer
    return: int
    print: sum of list
     */

    public static int sumIntegerList (List<Integer> nums){
        int sum = 0;
        for (int i = 0; i < nums.size(); i++){
            sum += nums.get(i);
        }

//        for (int i : nums){
//            sum += i;
//        }

        return sum;
    }


}
