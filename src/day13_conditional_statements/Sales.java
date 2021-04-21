package day13_conditional_statements;

public class Sales {
    public static void main(String[] args) {

        double bonus = 0;
        double salesAmount = 2000.55;

        if (salesAmount<=1000){
            System.out.println("Good job, you qualified for bonus!");
            bonus += 50;
        } else {
            System.out.println("Great job, you qualified full bonus!");
            bonus += 100;
        }
        System.out.println("Your bonus for sales amount is $" + bonus);
    }
}
