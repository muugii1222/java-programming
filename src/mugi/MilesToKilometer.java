package mugi;
import java.util.Scanner;
public class MilesToKilometer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the miles");
        double miles = scan.nextDouble();
        double kilometers = miles * 1.609;
        System.out.println(miles + " miles = " + kilometers);

    }
}
