package day45_oop;

import com.sun.xml.internal.xsom.XSUnionSimpleType;

public class TrafficLightObject {
    public static void main(String[] args) {

        //create traffic light object
        TrafficLight trafficLight1 = new TrafficLight();

//        trafficLight1.color = "green";
//        System.out.println(trafficLight1.color);

//       we will assign/update the value of color using a method of the class
        trafficLight1.changeColor("red");

//        call method to access the variable
        trafficLight1.showColor();

        trafficLight1.changeColor("green");
        trafficLight1.showColor();

        TrafficLight trafficLight2 = new TrafficLight();
        trafficLight2.changeColor("black");
        trafficLight2.showColor();




    }
}
