package day12_conditional_statements;

public class CompareChars {
    public static void main(String[] args) {
        char letter1 = 'B'; //on ASCII table
        char letter2 = 'M';
        System.out.println(letter1 > letter2);
        System.out.println(letter1 < letter2);
        System.out.println(letter1 == letter2);

        char grade = 'D';
        boolean pass = grade <= 'C';
        System.out.println("Did you pass tha exam? " + pass);

    }
}
