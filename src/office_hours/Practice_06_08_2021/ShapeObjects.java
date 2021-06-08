package office_hours.Practice_06_08_2021;

public class ShapeObjects {
    public static void main(String[] args) {
        Shape shape1 = new Shape();
        shape1.calculateArea();

        Square square= new Square();
        square.side = 5;
        square.calculateArea();
        square.calculatePerimeter();
        System.out.println(square);

        Rectangle rectangle = new Rectangle();
        rectangle.length =3;
        rectangle.width = 4;
        rectangle.calculateArea();
        rectangle.calculatePerimeter();
        System.out.println(rectangle);

        Circle circle = new Circle();
        circle.radius = 10;
        circle.calculateArea();
        circle.calculatePerimeter();
        System.out.println(circle);

    }
}
