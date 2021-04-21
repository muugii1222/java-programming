package day12_conditional_statements;

public class IfELseStatement {
    public static void main(String[] args) {
        if (10 > 5) {
            System.out.println("Condition is true"); // true so print it out
        } else {
            System.out.println("Condition is false"); // false so skip it
        }

        int count = 25;
        if (count > 30) {
            System.out.println("Count is more than 30");
        } else {
            System.out.println("Count is less than 30");
        }

        byte age = 15;
        if (age >= 18) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }

    }
}
