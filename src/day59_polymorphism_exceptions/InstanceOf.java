package day59_polymorphism_exceptions;

import day57_abstraction_polymorphism.shapes.Circle;
import day57_abstraction_polymorphism.shapes.Shape;
import day57_abstraction_polymorphism.shapes.Square;

public class InstanceOf {
    public static void main(String[] args) {
        //instance of operator
        Shape shape = new Circle();
        System.out.println(shape instanceof Circle);
        System.out.println(shape instanceof Square);

        if (shape instanceof Circle){
            System.out.println("It is a circle object");
        } else if (shape instanceof Square){
            System.out.println("It is a square object");
        }

        //java reflection API

        System.out.println(shape.getClass().getSimpleName());
        System.out.println(shape.getClass().getName());

        if (shape.getClass().getSimpleName().equals("Square")){
            System.out.println("It is a square object");
        }

        System.out.println(shape.getClass().getDeclaredMethods().length);

        WebElement el = new Link();
        System.out.println("Object class name of el variable" + el.getClass().getSimpleName());

    }
}
