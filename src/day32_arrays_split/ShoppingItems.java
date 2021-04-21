package day32_arrays_split;

public class ShoppingItems {
    public static void main(String[] args) {
//                            0         1       2           3       4           5
        String[] items  = {"Shoes", "Jacket","Gloves", "Airpods", "iPad", "iphone 11 case" };
        double[] prices = {99.99,     150.0,   9.99,    250.0 ,    439.50,   39.99};
        int[] itemIDs =   {12345 ,    12346,   12347,   12348,      12349,   12350};

        System.out.println("---------FIND THE INDEX OF 'gloves' in this array--------");

//      FOR LOOP IS SIMPLE FOR THIS, CUZ NEED TO FIND INDEX #
        for (int i = 0; i < items.length; i++) {
            if (items[i].equals("Gloves")) {
                System.out.println(i);      // 2
                break;
            }
        }


        System.out.println("------set boolean to true if first 'iPad' is found-----");

        boolean iPAdExists = false;

        for (int i = 0; i < items.length; i++) {
            if (items[i].equals("iPad")) {
                iPAdExists = true;
                break;
            }

        }
        System.out.println(iPAdExists);


//      WE CAN ALSO USE EACH BOOLEAN, cuz we don't need to find index #
        for (String item : items){
            if (item.equalsIgnoreCase("iPad")){
                iPAdExists = true;
                break;
            }
        }

        System.out.println("-----Print a report of ech shopping item-----");

        for (int i = 0; i < items.length; i++){
            String report = items[i] + " - $" + prices[i] + " - #" + itemIDs[i];
            System.out.println(report);
        }

        System.out.println("----Look for 'Jacket' in item and print all detais----");
        for(int i = 0; i<items.length; i++){
            if (items[i].equalsIgnoreCase("jacket")) {
                System.out.println(items[i] + " - $" + prices[i] + " - #" + itemIDs[i]);
            } else if (items[i].equalsIgnoreCase("gloves")){
                System.out.println(items[i] + " - $" + prices[i] + " - #" + itemIDs[i]);
            }
        }

        System.out.println("----Look for 'Jacket' in item and print all detais----");
        for (int i = 0; i < items.length; i++){
            switch (items[i]){
                case "Shoes":
                    System.out.println(items[i] + " - $" + prices[i] + " - #" + itemIDs[i]);
                    break;
                case "Jacket":
                    System.out.println(items[i] + " - $" + prices[i] + " - #" + itemIDs[i]);
                    break;
                case "Gloves":
                    System.out.println(items[i] + " - $" + prices[i] + " - #" + itemIDs[i]);
                    break;

            }

        }


    }
}
