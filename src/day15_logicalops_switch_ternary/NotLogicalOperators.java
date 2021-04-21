package day15_logicalops_switch_ternary;

public class NotLogicalOperators {
    public static void main(String[] args) {
        System.out.println("!true = " + (!true));
        System.out.println("!false = " + (!false));

        int age = 20;
        if (!(age > 7)) {
            System.out.println("Need to sit on car seat");
        } else {
            System.out.println("Allowed to sit on without car seat");
        }

        boolean isSmokingAllowed = true;
        if (!isSmokingAllowed) {
            System.out.println("Smoking is not allowed here");
        } else {
            System.out.println("This area is for smoking");
        }

        boolean isAffordable = true;
        if (!isAffordable) {
            System.out.println("Item not affordable");
        } else {
            System.out.println("Item affordable");
        }

        String env = "qa";
        if (!env.equals("qa")){
            System.out.println("In wrong environment for QA testing");
        }

        String carModel = "Tesla";
        if (!carModel.equals("Tesla")){
            System.out.println("I am not interested");
        }

        String secretPassword = "abc123";
        String inputPassword = "abc321";

        if (!inputPassword.equals("abc123")){
            System.out.println("Incorrect password");
        }
        if (!inputPassword.equals(secretPassword)){
            System.out.println("Incorrect password");
        }
        if (!inputPassword.equals("abc123")){
            System.out.println("Correct password");
        } else {
            System.out.println("Incorrect password");
        }
    }
}
