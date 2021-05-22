package day44_custom_classes;

public class AnimalObject {
    public static void main(String[] args) {

        Animal animal = new Animal();

        animal.type = "wolf";
        System.out.println(animal.type);

        animal.eat();
        animal.eat("meat");
        animal.speak();

        Animal cheetahObject = new Animal();
        cheetahObject.type = "cheetah";
        System.out.println(cheetahObject.type);
        cheetahObject.eat("cake");

    }
}
