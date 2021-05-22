package day43_list_custom_classes;

import com.sun.tools.corba.se.idl.InterfaceGen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ListMethods {
    public static void main(String[] args) {

        System.out.println(getDays());
        System.out.println(getDays().get(0));
        System.out.println("Size of ArrayList = " + getDays().size());

        List <String> dayNames = getDays();
        System.out.println("dayNames = " + dayNames);
        dayNames.add("java day");

////      way 1 -> for loop + if statement
//        for (int i = 0; i < dayNames.size(); i++){
//            if(!(i == 6)){
//            }
//        }
//        System.out.println("Using for loop = " + dayNames);

//      way 2 -> using removeIf method with lambda
        dayNames.removeIf(day -> day.length() == 6);
        System.out.println("day names after removeIf = " + dayNames);


        System.out.println(getRandomList(10));
        List<Integer> nums = getRandomList(100);
        System.out.println("nums size = " + nums.size());
        System.out.println("nums" + nums);
        nums.removeIf(n -> n<90);
        System.out.println("nums = " + nums);



    }


    public static List<String> getDays (){
        List<String> days= new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));
        return days;



    }

    public static List<Integer> getRandomList (int size){
        Random random = new Random(); //new random object
        List<Integer> nums = new ArrayList<>();

        for (int i = 1; i <= size; i++){
            // int n = random.nextInt(101);
//            if(!nums.contains(n)) {
//                nums.add(n);
//            }
            nums.add(random.nextInt(101)); //generate random number with 0-100 limit and add to list
        }
        return nums;

    }
}
