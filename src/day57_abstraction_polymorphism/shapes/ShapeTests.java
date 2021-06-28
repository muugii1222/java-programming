package day57_abstraction_polymorphism.shapes;

import java.util.ArrayList;
import java.util.List;

public class ShapeTests {
    public static void main(String[] args) {
        Shape triangle = new Triangle();
        triangle.draw();

        Shape circle = new Circle();
        circle.draw();

        Shape square = new Square();
        square.draw();

        List<Shape> shapes= new ArrayList<>();
        shapes.add(new Circle());
        shapes.add(new Square());
        shapes.add(new Triangle());

//        System.out.println(shapes); --> prints hashcode of objects
        for (Shape eachShape : shapes) {
            eachShape.draw();
        }
    }


}
