package day17_ternary_nested_conditions;
/*
selection = "drink" orr can be "snack"
drink = "tea" , "coke"
snack = "chips" , "candy"

when selection is "drink":
    "drink option is selected"

    when drink is "tea":
        "tea is selected"
    when drink is "coke":
        "coke is selected"
    when selection is "snack"
    "snack option is selected"

    when snack is "chips":
        "chips item is selected"
    when snack is "candy":
        "candy item is selected"
 */
public class VendingNestedIf {
    public static void main(String[] args) {

        String selection = "snack";  //snack
        String drinkItem = "tea";
        String snackItem = "chips";

        if (selection.equals("drink")) {                        // out statement 1
            System.out.println("Drink option is selected");
            if (drinkItem.equals("tea")) {                      // inner statement 1.1
                System.out.println("tea is selected");
            } else {                                            // inner statement 1.2
                System.out.println("coke is selected");
            }

        } else if (selection.equals("snack")) {                 // out statement 2
            System.out.println("Snack option is selected");
            if (snackItem.equals("chips")) {                    // inner statement 2.1
                System.out.println("chips item is selected");
            } else {                                            // inner statement 2.2
                System.out.println("candy item is selected");
            }
        }
    }
}