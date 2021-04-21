package office_hours.Practice_03_4_2021;

/*
Make a class Stage1Calculator
create a main method

    - Declare two double variables
    - Declare 5 more double variables for each operation.
        > Execute all the operation between the first two numbers
    - Print out operations
        Ex: if the nums are 5 and 10
            5 + 10 = 15
            5 - 10 = -5
            etc..
 */
public class StageCalculator {
    public static void main(String[] args) {
        double d1 = 105;
        double d2 = 45;

        double addition = d1 + d2;
        double subtraction = d1 - d2;
        double multiplication = d1 * d2;
        double division = d1 / d2;
        double remainder = d1 % d2;

        System.out.println("Calculation for " + d1 + " & " + d2);
        System.out.println(d1 + " + " + d2 + " = " +  addition);
        System.out.println(d1 + " - " + d2 + " = " + subtraction);
        System.out.println(d1 + " * " + d2 + " = " + multiplication);
        System.out.println(d1 + " / " + d2 + " = " + division);
        System.out.println(d1 + " % " + d2 + " = " + remainder);

        // Print without variables

        System.out.println("Calculation for " + d1 + " & " + d2);
        System.out.println(d1 + " + " + d2 + " = " + (d1 + d2));
        System.out.println(d1 + " - " + d2 + " = " + (d1 - d2));
        System.out.println(d1 + " * " + d2 + " = " + (d1 * d2));
        System.out.println(d1 + " / " + d2 + " = " + (d1 / d2));
        System.out.println(d1 + " - " + d2 + " = " + (d1 % d2));

    }
}
