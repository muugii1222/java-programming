package day18_conditions_practice_strings_intro;

public class IfWithoutCurlyBraces {
    public static void main(String[] args) {
        String todaysClass = "Python";

        // only one statement can write without { }

        if (todaysClass.equals("Java"))
            System.out.println("Java is fun");      //if it's doesn't match first one doesn't print
            System.out.println("Second statement"); // second one will be print



        int a = 10;
        if (a == 1)
            System.out.println("a is 1");
            System.out.println("1 is a");

    }
}
