package day56_abstraction.driveable;

import day56_abstraction.greeting.Greeting;

public class Plane extends Transportation implements SelfDrivable, Greeting {


    @Override
    public void autoDriving() {
        System.out.println("Flying on auto pilot mode");
    }

    @Override
    public void transportPeople() {
        System.out.println("Flying people from one city to another city");
    }

    @Override
    public void cost(int mile) {
        System.out.println("Plane costs " + (mile * 25.0) + " to drive " + mile + " miles");
    }

    @Override
    public void hi() {
        System.out.println("Hello hello");
    }

    @Override
    public void bye() {
        System.out.println("Thanks for flying with us");
    }
}
