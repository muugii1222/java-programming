package day32_arrays_split;

import java.util.Arrays;

public class MaxMinPrice {
    public static void main(String[] args) {

        //                  0         1         2           3       4           5
        String[] items = {"Shoes", "Jacket", "Gloves", "Airpods", "iPad", "iphone 11 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99, };
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};

        //        print String
        System.out.println(Arrays.toString(items));
        System.out.println(Arrays.toString(prices));
        System.out.println(Arrays.toString(itemIDs));

//         find most expensive item, cheapest item !
        double max = 0;
        double min = prices[0];
        int indexOfMaxPrice = 0;
        int indexOfMinPrice = 0;

        for (int i = 0; i < items.length; i++){
            if (prices[i]>max){
                max = prices[i];
                indexOfMaxPrice = i;
            }
            if (prices[i]<min){
                min = prices[i];
                indexOfMinPrice = i;
            }
        }

        System.out.println(max);
        System.out.println(indexOfMaxPrice);
        System.out.println(items[indexOfMaxPrice] + " - " + prices[indexOfMaxPrice] + " - " + itemIDs[indexOfMaxPrice]);

        System.out.println(min);
        System.out.println(indexOfMinPrice);
        System.out.println(items[indexOfMinPrice] + " - " + prices[indexOfMinPrice] + " - " + itemIDs[indexOfMinPrice]);


    }
}