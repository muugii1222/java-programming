package day34_void_method;

public class FirstMethod {
    public static void main(String[] args) {
        displayMessage();
        displayMessage();
        displayMessage();

        for (int i = 1; i <= 100; i++){
            System.out.print(i+"-");
            displayMessage();
        }


    }
//  FIRST CUSTOM REUSABLE METHOD
    public static void displayMessage (){           //!!! can write inside class anywhere but not inside main method !!!
        System.out.println("Hello world");
    }
}
