package day37_methods_overloading;

public class MethodOverLoading {
    public static void main(String[] args) {
        sum(2,3);
        System.out.println();
        sum(2.5,3.5);
        System.out.println();
        sum(2, 3, 4);
        System.out.println();
        sum((int) 2.3, 3, 4);
        System.out.println();
        sum("Munkh", "jargal");
    }


    public static void sum (int num1, int num2){
        System.out.println("sum(int, int)");
        System.out.println("Result = " + (num1+num2));
    }
    public static void sum (double num1, double num2){
        System.out.println("sum(double, double)");
        System.out.println("Result = " + (num1+num2));
    }
    public static void sum (int num1, int num2, int num3){
        System.out.println("sum(int, int, int)");
        System.out.println("Result = " + (num1+num2+num3));
    }
    public static void sum (String name1, String name2){
        System.out.println("sum(String, String)");
        System.out.println("Result = " + name1+name2);
    }
}
