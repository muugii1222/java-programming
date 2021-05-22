package day41_arraylist;


import java.util.ArrayList;

public class Cities {
    public static void main(String[] args) {
//        Declare arraylist
        ArrayList<String> cities = new ArrayList<>();

//        add str to arraylist
        cities.add("Washington DC");
        cities.add("New York");
        cities.add("Chicago");
        cities.add("Ulaanbaatar");

//        let's citi LA to add on index 0 of arraylist
        cities.add(0, "LA");

        System.out.println(cities);

//        print first and last citi
        System.out.println("first citi = " + cities.get(0));
        System.out.println("last citi = " + cities.get(4));

//        if don't know arraylist size, use size method
        System.out.println("last citi = " + cities.get(cities.size()-1));

//        print count of item in arraylist
        System.out.println("count if items = " + cities.size());

//        stored into variable
        int size = cities.size();
        System.out.println("size = " + size);

//        for loop and print all values in same line
        for (int i = 0; i <cities.size(); i++){
            System.out.print(cities.get(i) + ", ");
        }
        System.out.println();

//        for each loop
        for (String city : cities){
            System.out.print(city + " ");
        }
        System.out.println();

//        delete item from arraylist
       cities.remove(4);
       cities.remove("LA");
        System.out.println("after remove cities: " + cities);

//        delete all values from array list
        cities.clear();
        System.out.println("after clear everything from array list: " + cities);

//        check if arraylist is empty
        if(cities.isEmpty()){
            System.out.println("List is empty");
        }

        if(cities.size() == 0){
            System.out.println("List is empty");
        }


    }
}
