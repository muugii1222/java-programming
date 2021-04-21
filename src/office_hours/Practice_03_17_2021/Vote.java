package office_hours.Practice_03_17_2021;
/*
[EligibleToVote]

Redo the EligibleToVote task but this time ask which country the person has citizenship for

If the citizenship is for the USA then ask user to enter their age. Use the age to figure out if they vote.

    -> 18+ : You are eligible to vote
    -> < 18: You must be at least 18 years old to vote

If the person is not a USA citizen: You must be US citizen in order to vote"
 */
import java.util.Scanner;
public class Vote {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your citizenship status:");
        String citizenship = scan.next();

        if (citizenship.equals("USA")) {
            System.out.println("Enter your age");
            int age = scan.nextInt();
            if (age >= 18){
                System.out.println("You are eligible to vote");
            } else if (age < 18){
                System.out.println("You must be at least 18 years old to vote");
            }
        } else {
            System.out.println("You must be US citizen in order to vote");
        }
    }
}
