package day41_arraylist;

import java.util.ArrayList;
import java.util.List;

public class UpdatingArrayList {
    public static void main(String[] args) {
        List<String> myCars = new ArrayList<>();
        myCars.add("Toyota");
        myCars.add("Tesla");
        myCars.add("Ford");
        myCars.add("Acura");
        myCars.add(0, "Kluger");
        myCars.add(1, "Honda");

//        print all arraylist
        System.out.println(myCars);

//        print arraylist to string
        System.out.println(myCars.toString());

//        store all array list in 1 string to variable
        String allCarsIn1St = myCars.toString();
        System.out.println(allCarsIn1St);

//        change index 0 to Lamborghini
        myCars.set(0, "Lamborghini");
        System.out.println(myCars);
        System.out.println(myCars.toString());

//        find index number of "Tesla"
        System.out.println("index of Tesla: " + myCars.indexOf("Tesla"));

        int fordIndex = myCars.indexOf("Ford");
        System.out.println("Ford index = " + fordIndex);

        myCars.set(fordIndex, "Suburu");
        System.out.println(myCars);

        myCars.set(myCars.indexOf("Honda"), "Trabant");
        System.out.println(myCars);

        myCars.set(myCars.indexOf("Tesla"), "Ford");
        System.out.println(myCars);

        if(myCars.contains("Toyota")){
            myCars.set(myCars.indexOf("Toyota"), "BMW");
            System.out.println(myCars);
        } else {
            System.out.println("Toyota not found");
        }

        for (int i = 0; i<myCars.size(); i++){
            if (myCars.get(i).equals("Lamborghini")){
                myCars.set(i, "Prius");
            } else if (myCars.get(i).equals("Suburu")){
                myCars.set(i, "Lexus");
            } else if (myCars.get(i).equals("Trabant")){
                myCars.set(i, "Audi");
            }

        }
        System.out.println(myCars);










    }
}
