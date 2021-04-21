package office_hours.Practice_03_8_2021;

//  PIC: Package --> Import --> Class
/*
Make a class Rectangle
create a main method

     - Declare two variables: length and width

         - Calculate the Perimeter 2(l*w)
         - Calculate the Area (w * l)

     - Print properties of the Rectangle

     - Modify to accept Scanner inputs

 */

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length");
//        double length = 5;
//        double width = 3;

        double length = scan.nextDouble();
        System.out.println("Enter the width");
        double width = scan.nextDouble();
        double perimeter = 2 * (length + width);
        double area = width * length;
        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);

    }
}
