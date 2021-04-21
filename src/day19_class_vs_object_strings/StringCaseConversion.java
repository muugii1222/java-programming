package day19_class_vs_object_strings;

import java.util.Locale;

public class StringCaseConversion {
    public static void main(String[] args) {

        String word = "CyberTek";

        System.out.println(word.toLowerCase());
        System.out.println(word.toUpperCase());

        System.out.println("CyberTek".toLowerCase());  // same
        System.out.println("CyberTek".toUpperCase());  // same

        String sentence = "Java is fun but hard";
        System.out.println(sentence.toUpperCase());

        word.toLowerCase();
        System.out.println(word);   //doesn't change

        String wordInClass = word.toLowerCase();
        System.out.println(wordInClass);        // all lowercase cuz declared first

        word = word.toLowerCase();
        System.out.println("word = " + word);

        System.out.println("Amazon".toUpperCase());
        String company = "Amazon";
        System.out.println(company.toUpperCase());
        
//        change company "Amazon" to "AMAZON"
        System.out.println("company = " + company);
        company = company.toUpperCase();        //assign back to Uppercase 
        System.out.println("company = " + company);


    }
}
