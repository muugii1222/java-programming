package day36_methods_with_return;

public class Calculator {
    public static void main(String[] args) {

        System.out.println(add(456, 657));
        double sum = add(1, 3);
        System.out.println("sum = " + sum);
        System.out.println("100.0 + 200.0 = " + add(100, 200));


        System.out.println(minus(7654, 435));
        System.out.println(divide(35, 5));
        System.out.println(multi(34, 546));

    }

    public static double add (double num1, double num2){
        double result = num1 + num2;
        return result;

    }
    public static double minus (double num1, double num2){
        double result = num1 - num2;
        return result;
    }
    public static double divide (double num1, double num2){
        double result = num1 / num2;
        return result;
    }
    public static double multi (double num1, double num2){
        double result = num1 * num2;
        return result;
    }
}
