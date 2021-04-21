package office_hours.Practice_03_17_2021;
/*
 Ternary
=======================================================

[Eligible to get Loan]

Given two values: yearly salary and credit score determine if you can get a loan.

    To be approve for the loan, print:  Credit Score::
        Salary: above 60,000
        Credit Score: above 650
    Otherwise print: "Loan Denied"
 */
import java.util.Scanner;
public class TernaryLoan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your annual income:");
        double salary = scan.nextDouble();
        System.out.println("Enter your credit score:");
        int creditScore = scan.nextInt();

        String loan = salary >= 60_000 && creditScore >= 650?  "Eligible for loan" : "Loan Denied";
        System.out.println(loan);


    }
}
