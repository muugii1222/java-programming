package day50_inheritance.overriding;

public class AnimalTest {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.name = "Sindy";
        animal.type = "Pudil";
        animal.speak();

        Cat cat = new Cat();
        cat.speak();

        Dog dog = new Dog();
        dog.speak();
    }
}
