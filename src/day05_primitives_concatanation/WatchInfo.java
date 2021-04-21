package day05_primitives_concatanation;

public class WatchInfo {
    public static void main(String[] args){
        String brand = "Coach";
        String color = "Gold";
        double price = 250;
        boolean waterResistant = false;
        boolean isSmart = false;
        char gender = 'F';

        System.out.println("Brand name:\t\t\t"+ brand);
        System.out.println("Color:\t\t\t\t"+ color);
        System.out.println("Price:\t\t\t\t$"+ price);
        System.out.println("Water resistant:\t"+ waterResistant);
        System.out.println("Smart:\t\t\t\t"+ isSmart);
        System.out.println("Gender:\t\t\t\t"+ gender);

        System.out.println("Brand name:\t\t\t" + brand + "\nColor:\t\t\t\t" + color + "\nPrice:\t\t\t\t$" + price);


    }
}
