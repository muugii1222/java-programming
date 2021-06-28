package day57_abstraction_polymorphism.abstract_class_vs_interface;

public abstract class AbstractA {
    int num;
    private double price;
    public static int count;
    public final String TYPE = "abstract";
    public static final String LANGUAGE = "java";

    //Abstract class can have abstract method, non abstract method, static method

    public abstract void abstractMethodA();

    public void methodB(){
        System.out.println("methodB called");
    }

    public static void staticMethodC(){
        System.out.println("static method C is called");
    }
}
