package day15_logicalops_switch_ternary;

public class UsedCarSelector {
    public static void main(String[] args) {
        double budget = 5000;
        String model = "Tesla";
        double carPrice = 8500;

        if (carPrice <= budget && (model.equals("Toyota") || model.equals("Honda") || model.equals("Tesla"))) {
            System.out.println("I would like to buy " + model + " for $" + carPrice);
        } else {
            System.out.println("I have to consider again " + model + " for $" + carPrice);
        }
    }
}
