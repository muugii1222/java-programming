package day21_string_manupulation;

public class StringCharAt {
    public static void main(String[] args) {
//                     0123
        String word = "java";
        System.out.println(word.charAt(0));
        System.out.println(word.charAt(1));
        System.out.println(word.charAt(2));
        System.out.println(word.charAt(3));
//        System.out.println(word.charAt(4)); error

        System.out.println(word.length());
//                        12345678
        String company = "Cybertek";
        System.out.println("first letter: " + company.charAt(0));
        System.out.println("second letter: " + company.charAt(1));
        char first = company.charAt(0);
        char second = company.charAt(1);
        char third = company.charAt(2);
        char fourth = company.charAt(3);
        char fifth = company.charAt(4);
        char sixth = company.charAt(5);
        char seventh = company.charAt(6);
        char eighth = company.charAt(7);

        System.out.println(first + " " + second + " " + third + " " + fourth + " " + fifth + " " + sixth + " " +    seventh + " " + eighth);

        String withSpaeces = first + " " + second + " " + third + " " + fourth + " " + fifth + " " + sixth + " " +    seventh + " " + eighth;

        System.out.println(withSpaeces);




    }
}
