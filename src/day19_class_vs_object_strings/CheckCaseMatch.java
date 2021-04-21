package day19_class_vs_object_strings;

import java.util.Locale;

public class CheckCaseMatch {
    public static void main(String[] args) {
        String countryCode = "usa";
//                  usa       ==      USA
        if (countryCode.equals(countryCode.toUpperCase() ) ){
            System.out.println("Pass - case is correct");
        } else {
            System.out.println("Fail - case is incorrect");
        }

        if (countryCode.equals(countryCode.toLowerCase())) {
            System.out.println("correct");
        } else {
            System.out.println("incorrect");
        }
    }
}
