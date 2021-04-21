package mugi;
import java.util.Scanner;
public class GroceryShopping1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter price for milk: ");
        double milk = scan.nextDouble();
        System.out.println("Enter price for bread: ");
        double bread = scan.nextDouble();
        System.out.println("Enter price for cucumber: ");
        double cucumber = scan.nextDouble();
        double total = milk + bread + cucumber;
        System.out.println("Total is $" + total);
    }
}
