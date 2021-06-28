package day57_abstraction_polymorphism.abstract_class_vs_interface;

public class ConcreteA extends AbstractA implements InterfaceA, InterfaceB{
    //non abstract child of abstract class or interface called concrete

    @Override
    public void abstractMethodA() {
        System.out.println("abstractMethodA implementation is called");
    }

    @Override
    public void methodB() {
        System.out.println("methodB overridden version is called");
    }

//    @Override --> static methods are hidden
    public static void staticMethodC() {
        System.out.println("staticMethodC hidden version is called");
    }


    @Override
    public void abstractMethodD(int num) {
        System.out.println("abstractMethodD overridden version is called");
    }
}
