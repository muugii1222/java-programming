package day41_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAsList {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(23, 1, 34, 54, 654);
        System.out.println("nums = " + nums);
//        nums.add(100); --> UnsupportedOperationException
//        nums.remove(0); --> UnsupportedOperationException
//        nums.clear(); --> UnsupportedOperationException

        List<Integer> numsList = new ArrayList<>(Arrays.asList(4, 2, 4, 23, 5344, 100));
        numsList.add(33);
        numsList.add(56);
        System.out.println(numsList);
        numsList.remove(0);
        numsList.remove(new Integer(23));
        System.out.println(numsList);




        List<String> drinksWithCaffeine = new ArrayList<>(Arrays.asList("coffee", "tea", "monster", "red bull", "coke", "pepsi", "mdew", "kambucha", "celsius"));
        int caffeineAmount = 0;

// using for loop + if statement
        System.out.println("using for loop + if statement");
        for(int i = 0; i<drinksWithCaffeine.size(); i++) {
            if (drinksWithCaffeine.get(i).equals("monster") || drinksWithCaffeine.get(i).equals("red bull") || drinksWithCaffeine.get(i).equals("celsius")) {
                caffeineAmount = 150;
                System.out.println(drinksWithCaffeine.get(i) + " --> " + caffeineAmount);
            } else if (drinksWithCaffeine.get(i).equals("coffee") || drinksWithCaffeine.get(i).equals("kambucha")) {
                caffeineAmount = 112;
                System.out.println(drinksWithCaffeine.get(i) + " --> " + caffeineAmount);
            } else if (drinksWithCaffeine.get(i).equals("tea") || drinksWithCaffeine.get(i).equals("coke") || drinksWithCaffeine.get(i).equals("pepsi") || drinksWithCaffeine.get(i).equals("mdew")) {
                caffeineAmount = 35;
                System.out.println(drinksWithCaffeine.get(i) + " --> " + caffeineAmount);
            }
        }

//        using for each loop + if statement
        System.out.println();
        System.out.println("using for each loop + if statement");
        for (String eachDrink : drinksWithCaffeine){
            if (eachDrink.equals("monster") || eachDrink.equals("red bull") || eachDrink.equals("celsius")) {
                caffeineAmount = 150;
                System.out.println(eachDrink + " --> " + caffeineAmount);
            } else if (eachDrink.equals("coffee") || eachDrink.equals("kambucha")) {
                caffeineAmount = 112;
                System.out.println(eachDrink + " --> " + caffeineAmount);
            } else if (eachDrink.equals("tea") || eachDrink.equals("coke") || eachDrink.equals("pepsi") || eachDrink.equals("mdew")) {
                caffeineAmount = 35;
                System.out.println(eachDrink + " --> " + caffeineAmount);
            }
        }

// using for each loop + switch statement
        System.out.println();
        System.out.println("using for each loop + switch statement");
        for (String eachDrink : drinksWithCaffeine){
            switch (eachDrink){
                case "monster": case "red bull": case "celsius":
                    caffeineAmount = 150;
                    System.out.println(eachDrink + " --> " + caffeineAmount);
                    break;
                case "coffee": case "kambucha":
                    caffeineAmount = 112;
                    System.out.println(eachDrink + " --> " + caffeineAmount);
                    break;
                case "tea": case "coke": case "pepsi": case "mdew":
                    caffeineAmount = 35;
                    System.out.println(eachDrink + " --> " + caffeineAmount);
                    break;
            }
        }

        drinksWithCaffeine.forEach(drink -> System.out.println(drink));
        drinksWithCaffeine.forEach(drink -> {
            System.out.println("-----");
            System.out.println("drink = " + drink);
            System.out.println("-----");
        });

    }
}
