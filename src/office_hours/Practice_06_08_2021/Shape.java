package office_hours.Practice_06_08_2021;

public class Shape {

    double area;
    double perimeter;

    public void calculateArea(){
        System.out.println("Shape method");
    }

    public void calculatePerimeter(){
        System.out.println("Shape perimeter");
    }

    @Override
    public String toString() {
        return "Shape{" +
                "area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
}
