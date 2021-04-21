package day15_logicalops_switch_ternary;

public class AndOperatorPractice {
    public static void main(String[] args) {
        boolean onsale = true;
        boolean freeShipping = false;
        String itemName = "Wooden spoon";

        if (onsale && freeShipping) {
            System.out.println("Adding to cart - " + itemName);
        } else {
            System.out.println("Continue shopping for good deals on " + itemName);
        }

//            add to cart only when it is freeShipping, onSale and itemName is "Wooden spoon"

            if (freeShipping && onsale && itemName.equals("Wooden spoon")) {
            System.out.println("Adding to cart - " + itemName);
        } else {
            System.out.println("Continue shopping for good deals on " + itemName);
        }

    }
}
