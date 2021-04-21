package day20_string_manipulation;

import day03_escape_sequence.ShoppingReceipt;

import java.util.Locale;

public class StringContains {
    public static void main(String[] args) {
        String company = "Capital one";
        System.out.println(company.contains("i"));
        System.out.println(company.contains("ital"));
        System.out.println(company.contains("l o"));

        if (company.contains(" ")) {
            System.out.println("Multiple words company name");
        } else {
            System.out.println("Single word company");
        }

        String etsyTitle = "Wooden spoon | ETsy";

        if (etsyTitle.contains(" | ")){
            System.out.println("Title pass");
        } else {
            System.out.println("Title fail");
        }

        String firstName = "Ahmed";

        if (firstName.contains("A") && firstName.contains("e")){
            System.out.println(firstName);
        } else {
            System.out.println("no");
        }

        firstName = "Nadir";
        if (firstName.contains("a") || firstName.contains("i")){
            System.out.println("a or i is present");
        } else {
            System.out.println("a or i is not present");
        }


        String email = "muugii1222@yahoo.com";

        if (email.contains("@") && email.endsWith(".com")){
            System.out.println("Valid email");
        } else {
            System.out.println("Invalid email");
        }

        if (email.toUpperCase().contains("M")) {
            System.out.println("M is present");
        } else {
            System.out.println("M is not present");
        }
    }
}
