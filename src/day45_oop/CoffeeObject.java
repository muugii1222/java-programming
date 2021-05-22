package day45_oop;

public class CoffeeObject {
    public static void main(String[] args) {
        Coffee myCoffee = new Coffee();
        System.out.println("coffee amount: " + myCoffee.getAmount());

        myCoffee.refill();
        System.out.println("amount after refill: " + myCoffee.getAmount());

        myCoffee.drink(10);
        System.out.println("amount after drink: " + myCoffee.getAmount());

        myCoffee.setType("Latte");
        System.out.println("My coffee = " + myCoffee.getType());

        //describe myCoffee -> show all variable values
        System.out.println(myCoffee.toString());

        //add another coffee object, set values, call methods
        Coffee coffee1 = new Coffee();
        coffee1.setType("cappuccino");
        System.out.println("coffee1 type = " + coffee1.getType());

        Coffee coffee2 = new Coffee();
        coffee2.setType("Frapuccino");
        System.out.println(coffee2);

        coffee2 = coffee1;
        System.out.println(coffee2.getType());





    }


}

