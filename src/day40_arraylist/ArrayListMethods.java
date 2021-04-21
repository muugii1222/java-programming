package day40_arraylist;

import java.util.*;

public class ArrayListMethods {
    public static void main(String[] args) {
        List<String> shoppingList = new ArrayList<>();

        System.out.println("size = " + shoppingList.size());
        System.out.println("isEmpty? " + shoppingList.isEmpty());

        if(shoppingList.isEmpty()){
            System.out.println("List is empty");
        } else {
            System.out.println("List is not empty");
        }


        shoppingList.add("shoes");
        shoppingList.add("monitor");
        shoppingList.add("mask");
        shoppingList.add("wooden spoon");
        shoppingList.add("scooter");
        shoppingList.add("java book");
        shoppingList.add("tesla");

        if(shoppingList.isEmpty()){
            System.out.println("List is empty");
        } else {
            System.out.println("List is not empty");
        }

        int count = shoppingList.size();
        System.out.println("how many items: " + count);

        System.out.println("is shoes in my list? " + shoppingList.contains("shoes"));

        if(shoppingList.contains("shoes")){
            System.out.println("Shoes is in the list");
        } else {
            System.out.println("Shoes is not in the list");
        }

        System.out.println("Buying shoes ... $80");

        shoppingList.remove("shoes");
        System.out.println("list without shoes: " + shoppingList);

        System.out.println("Done shopping");
        shoppingList.clear(); //clear the list
        System.out.println(shoppingList);

    }
}
