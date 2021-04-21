package day13_conditional_statements;

public class IfWithBooleanVariable {
    public static void main(String[] args) {

        boolean isHungry = true;

        if (isHungry){
            System.out.println("I am hungry I will go get something to eat\nThen code Java");
        } else {
            System.out.println("I am not hungry, Let's keep coding Java!");
        }

        double price = 130.44;
        boolean isAffordable = price <= 200.0; // 200 is budget

        System.out.println("isAffordable = " + isAffordable);
        if (isAffordable) {
            System.out.println("I can afford it, Let's buy!");
        } else {
            System.out.println("Too expensive, let's keep coding java!");
        }

        boolean isRemoteJob = true;
        // print if not first
         /*
         isRemoteJob != true            same, can use one of them
         !isRemoteJob
         isRemoteJob == false
          */

        if (isRemoteJob != true){
            System.out.println("Sorry, I am not interested.");
        } else {
            System.out.println("Sure Iam interested, what is the interview process");
        }



    }
}
