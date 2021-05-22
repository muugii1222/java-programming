package day44_custom_classes;

public class Animal {

    //    instance/object variables
    String type;

    //    instance/object method --> behaviour
    public void eat(){
        System.out.println(type + " eating");
    }

    public void eat(String food) {
        System.out.println(type + " eating " + food);
    }

    public void speak() {
        System.out.println(type + " speaking");
    }
}
