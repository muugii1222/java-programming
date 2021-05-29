package day48_constructors_static.static_examples;

public class CalculatorTest {
    public static void main(String[] args) {

        //static method --> call by className.staticMethodName
        Calculator.add(5, 3);

        //instance method --> create new object first
        Calculator calcObject = new Calculator();
        calcObject.multiply(2, 4);

        //static method can also be called using an
        calcObject.add(10, 2);


    }
}
