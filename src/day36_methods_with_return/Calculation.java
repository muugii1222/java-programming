package day36_methods_with_return;

public class Calculation {
    public static void main(String[] args) {

//  

        System.out.println("add " + Calculator.add(34, 45));
        System.out.println("minus" + Calculator.minus(34, 2));
        System.out.println("divide" + Calculator.divide(55, 5));
        System.out.println("multi" + Calculator.multi(23, 2));

        double d1 = 234.3;
        double d2 = 321.4;
        double result = Calculator.add(d1, d2);
        System.out.println("result = " + result);
        
    }
}
