package day10_shorthand_operators;

import javax.lang.model.SourceVersion;

public class ChangeVariableValue {
    public static void main(String[] args) {
        int count = 3;
        System.out.println("count = " + count);
//      increase count by 2
        count = count + 2;
        System.out.println("count = " + count);
        
        int apples = 2;
        System.out.println("apples = " + apples);
        apples = apples + 10;
        System.out.println("apples = " + apples);
        apples = apples - 3;
        System.out.println("apples = " + apples);
        
        int pizzaSlices = 20;
        System.out.println("pizzaSlices = " + pizzaSlices);
        pizzaSlices = pizzaSlices / 2;
        System.out.println("pizzaSlices = " + pizzaSlices);
        
        int players = 10;
        System.out.println("players = " + players);
        players = players * 2;
        System.out.println("players = " + players);
        
        int cents = 256;
        System.out.println("cents = " + cents);
//        keep whole dollars and assign remaining cents
        cents = cents % 100; // 100 + 100 + 56
        System.out.println("cents = " + cents); //reminder
        
    }
}
