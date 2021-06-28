package day57_abstraction_polymorphism.abstract_class_vs_interface;

public class Runner {
    public static void main(String[] args) {
        //AbstractA abstractA = new AbstractA();    --> can't create object(instantiate)
        //InterfaceA interfaceA = new InterfaceA(); --> can't create object(instantiate)

        InterfaceA.staticMethodE("wooden spoon");
    }
}
