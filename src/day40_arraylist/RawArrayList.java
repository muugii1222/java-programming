package day40_arraylist;

import java.util.ArrayList;
import java.util.List;

public class RawArrayList {
    public static void main(String[] args) {

//        DECLARE RAW (can store objects of any type) ARRAYLIST: 2 WAYS

        ArrayList list1 = new ArrayList();
        List list2 = new ArrayList();


//        ADD DATA TO ARRAYLIST: ADD METHOD

        list1.add("java");
        list1.add("apples");
        list1.add("coffee");
        list1.add(1234);
        list1.add(55.2);
        list1.add(true);
        list1.add("wooden spoon");

        System.out.println(list1);
        System.out.println(list1.size());

    }
}
