package mugi;
import java.util.Scanner;
public class SpeedCheck1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your speed:");
        int speedLimit = 45;
        int currentLimit = scan.nextInt();
        int overLimit = currentLimit - speedLimit;
        System.out.println("You are driving " + overLimit + "mph over the limit");
    }
}
