package day58_polymorphism.superman;

public class SupermanTest {
    public static void main(String[] args) {
        Father superMan1 = new Superman();
        superMan1.feedKid();
        superMan1.playWithKid();
        superMan1.raiseKid();

        //superMan1.work("SDET") --> ERROR: Father type can only access method in father

        Worker superMan2 = new Superman();
        superMan2.work("SDET");
        System.out.println("got paid $ " + superMan2.getPaid());

        //superMan2.raiseKid(); --> ERROR

        Superman superMan3 = new Superman();
        superMan3.raiseKid();
        superMan3.playWithKid();
        superMan3.feedKid();
        superMan3.work("Developer");
        superMan3.getPaid();
    }
}
