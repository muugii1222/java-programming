package day56_abstraction.driveable;

public class DriveableTest {
    public static void main(String[] args) {
        Tesla tesla = new Tesla();
        tesla.start();
        tesla.hi();
        tesla.transportPeople();
        tesla.autoDriving();
        tesla.cost(25);
        tesla.stop();
        tesla.bye();

        Plane plane = new Plane();
        plane.start();
        plane.hi();
        plane.transportPeople();
        plane.autoDriving();
        plane.cost(250);
        plane.autoDriving();
        plane.stop();
        plane.bye();


        //Polymorphism
        SelfDrivable sd = new Plane();
        SelfDrivable sd2 = new Tesla();
    }
}
