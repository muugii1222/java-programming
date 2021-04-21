package office_hours.Practice_03_2_2021;

/*
Create a class named Computer
create a main method

    - Create variables with most appropriate datatypes:

        - brand, processor, ram memory, storage memory, has monitor, has wifi card, description, price, cpu, color, number of monitors, number of usb slots, has usb 3.0

        - Print out all the variables and values of the computer
 */

import java.util.Arrays;

public class Computer {
    public static void main(String[] args) {
        String brand = "Apple";
        double processor = 1.4;
        byte ramMemory = 8;
        short storageMemory = 121;
        boolean hasMonitor = true;
        boolean hasWifiCard = true;
        String description = "New model of 2019";
        double price = 1900;
        String cpu = "Quad-Core Intel Core i5";
        String color = "Grey";
        byte numberOfMonitors = 1;
        byte numberOfUsbSlots = 2;
        boolean hasUsb3 = true;

        System.out.println("Brand:\t\t\t\t\t" + brand);
        System.out.println("Processor:\t\t\t\t" + processor + "GHz");
        System.out.println("Ram memory:\t\t\t\t" + ramMemory + "GB");
        System.out.println("Storage memory:\t\t\t" + storageMemory + "GB");
        System.out.println("Has monitor:\t\t\t" + hasMonitor);
        System.out.println("has WiFi card:\t\t\t" + hasWifiCard);
        System.out.println("Description:\t\t\t" + description);
        System.out.println("Price:\t\t\t\t\t$" + price);
        System.out.println("CPU:\t\t\t\t\t" + cpu);
        System.out.println("Color:\t\t\t\t\t" + color);
        System.out.println("Number of monitors:\t\t" + numberOfMonitors);
        System.out.println("Number of USB slots:\t" + numberOfUsbSlots);
        System.out.println("Has USB 3:\t\t\t\t" + hasUsb3);

    }
}
