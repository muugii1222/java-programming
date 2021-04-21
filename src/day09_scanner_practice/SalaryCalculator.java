package day09_scanner_practice;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter hourly rate:");
        double workHours = scan.nextDouble();
        double weeklyPay = workHours * 40; //40 is work hours in week
        double monthlyPay  = weeklyPay * 52 / 12; //1 year has 52 weeks and 12 months
        double annualPay = monthlyPay * 12;

        System.out.println("Weekly pay is $" + weeklyPay);
        System.out.println("Monthly pay is $" + monthlyPay);
        System.out.println("Annual pay is $" + annualPay);
    }
}
