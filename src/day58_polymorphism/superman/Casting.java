package day58_polymorphism.superman;

import day58_polymorphism.superman.Father;
import day58_polymorphism.superman.Superman;
import day58_polymorphism.superman.Worker;

public class Casting {
    public static void main(String[] args) {
        Worker worker = new Superman();
        worker.work("QA Manager");
        worker.getPaid();

        //worker.raiseKid(); --> ERROR
        //if we cast it it will work
        ((Father)worker).raiseKid();
        ((Superman)worker).playWithKid();


        //DOWNCASTING --> super class to sub class
        Superman superman = new Superman();
        superman.feedKid();
        superman.work("java dev");
    }
}
