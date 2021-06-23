package day56_abstraction.driveable;

import day56_abstraction.greeting.Greeting;

public class Tesla extends Transportation implements SelfDrivable, Greeting {
    @Override
    public void transportPeople() {
        System.out.println("Tesla is transporting people on the roads");
    }

    @Override
    public void cost(int mile) {
        System.out.println("Tesla costs " + (mile * 0.10) + " to drive " + mile + " miles");
    }

    @Override
    public void autoDriving() {
        System.out.println("Tesla is driving on automuonus mode");
    }

    @Override
    public void hi() {
        System.out.println("Hello hello");
    }

    @Override
    public void bye() {
        System.out.println("Thanks for driving with us");
    }
}
