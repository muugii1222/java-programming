package day57_abstraction_polymorphism.polymorphism;

import java.util.ArrayList;
import java.util.List;

public class AnimalTests {
    public static void main(String[] args) {
        Animal animal = new Animal(); //not polymorphic, data type and object type are SAME
        animal.makeNoise();
        //Polymorphism - polymorphic way:
        //parent type =  new child type
        Animal a1 = new Dog();
        Animal a2 = new Horse();
        Animal a3 = new Cat();

        a1.makeNoise();
        a2.makeNoise();
        a3.makeNoise();

        //Polymorphic list of objects. List data type is Parent class.
        //objects are any of child classes
        List<Animal> listOfAnimals = new ArrayList<>();
        listOfAnimals.add(new Dog());
        listOfAnimals.add(new Dog());
        listOfAnimals.add(new Horse());
        listOfAnimals.add(new Cat());

        for (Animal each : listOfAnimals) {
            each.makeNoise();
        }

    }
}
