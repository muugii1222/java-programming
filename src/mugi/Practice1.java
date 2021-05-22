package mugi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Hide Password

Given an array of passwords (String). Hide each password as a star (*) and show the hidden password
Ex:
Input:{"one", "hi", "hold}
Output: [ ***, **, **** ]
 */


public class Practice1 {
    public static void main(String[] args) {

        String [] password = {"one", "hi", "hold"};
        List<String> hiddenPassword = new ArrayList<>();

        for (String each : password){
            hiddenPassword.add(convertToStars(each));
        }

        System.out.println(hiddenPassword);



    }

    public static String convertToStars (String str){
        String stars = "";
        for (int i = 0; i < str.length(); i++){
            stars += "*";
        }
        return stars;
    }

}
