package office_hours.Practice_03_12_2021_IfStatement;

/*
Create a program that will accept a number and it will print if it is evenly divisible by 2, 3, and 5

Ex:
number = 65

Output:
65 is divisible by 2: false
65 is divisible by 3: false
65 is divisible by 5: true

 */
public class BooleanExpressionsOperators {
    public static void main(String[] args) {
        int number = 9;
        boolean isDivisible = true;

        if (number % 2 == 0){
            System.out.println(number + " is divisible by 2: " + isDivisible);
        } else if (number % 3 == 0){
            System.out.println(number + " is divisible by 3: " + isDivisible);
        } else if (number % 5 == 0){
            System.out.println(number + " is divisible by 5: " + isDivisible);
        }
    }
}
