package mugi;
import java.util.Scanner;
public class TempConvert1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter the fahrenheit:");
        double fahrenheit = scan.nextDouble();
        double celsius = (fahrenheit - 32) * 5/9;
        System.out.println(fahrenheit + " = " + celsius + " celsius ");




    }
}
