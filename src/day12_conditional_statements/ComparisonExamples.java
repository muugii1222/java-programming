package day12_conditional_statements;

public class ComparisonExamples {
    public static void main(String[] args) {
        double currentSpeed = 45;
        double speedLimit = 55;
//        boolean isSpeeding = currentSpeed > speedLimit;  --> can use this way too
        boolean isSpeeding = currentSpeed < speedLimit;
        System.out.println("Are you speeding? " + isSpeeding);

        speedLimit += 20; //speed limit increase by 20
        isSpeeding = currentSpeed > speedLimit;
        System.out.println("Are you speeding? " + isSpeeding);

        double accountBalance = 250.25;
        double itemPrice = 300;
        System.out.println("Can I afford it? " + (accountBalance >= itemPrice));

        boolean canAfford = accountBalance >= itemPrice;
        System.out.println("Can I afford it? " + canAfford);

//        accountBalance = accountBalance - itemPrice; --> same
        accountBalance -= itemPrice;
        System.out.println(accountBalance);

        boolean isBroke = accountBalance <= 0;
        System.out.println("Am I Broke? " + isBroke);







    }
}
