package day33_arrays;

import java.util.Arrays;

/**
                0                   1
 0    "Teodora Tsvetanov"    "TeodorasPWD12"
 1    "Anna Ziyayeva"    "AnnaAlmaty123"
 2    "Parvin Altae"    "ParvinVienna321"
 */

public class MultiDArrayExample {
    public static void main(String[] args) {
//        2 group of users           first group has 3 users    1. has 3 users
        String [][] users = new String      [3]                        [2];

//        longer way
        users[0][0] = "Teodora Tsvetanov";
        users[0][1] =  "TeodorasPWD12";
        users[1][0] = "Anna Ziyayeva";
        users[1][1] =  "AnnaAlmaty123";
        users[2][0] = "Parvin Altae";
        users[2][1] =  "ParvinVienna321";

//        shorter way
        String [][] userData = { {"Teodora Tsvetanov", "TeodorasPWD12"},
                                 {"Anna Ziyayeva", "AnnaAlmaty123"},
                                 {"Parvin Altae", "ParvinVienna321"} };

        System.out.println(userData[0][0]);
        System.out.println(userData[1][0]);
        System.out.println(userData[2][0]);

        System.out.println(userData[0][1]);
        System.out.println(userData[1][1]);
        System.out.println(userData[2][1]);

        System.out.println(Arrays.deepToString(userData));


    }
}
