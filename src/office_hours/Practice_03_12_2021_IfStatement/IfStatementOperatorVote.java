package office_hours.Practice_03_12_2021_IfStatement;
  /*
        Write a java program that can identify if a person is eligible to vote
        for the president. Age of voting: 18. Print "Eligible to vote" or "not eligible to vote".

    => To make it dynamic change the three angles to be Scanner inputs
         */
import java.util.Scanner;
public class IfStatementOperatorVote {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int voteAge = scan.nextInt();
        if (voteAge >= 18){
            System.out.println("Eligible to vote");
        } else {
            System.out.println("not eligible to vote");
        }


    }
}
