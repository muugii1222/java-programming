package mugi;
import java.util.Scanner;
public class GiftCard {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String item = scan.next();
        int balance = 100;

        String item1 = "blanket";
        int price1 = 60;

        String item2 = "charger";
        int price2 = 25;

        String item3 = "hat";
        int price3 = 25;

        String item4 = "headphones";
        int price4 = 30;

        String item5 = "laptop";
        int price5 = 200;

        String item6 = "pants";
        int price6 = 50;

        String item7 = "pillow";
        int price7 = 40;

        String item8 = "smartphone";
        int price8 = 1000;

        String item9 = "socks";
        int price9 = 5;

        String item10 = "USB Cable";
        int price10 = 10;


        if (item.equals("blanket")){
            System.out.println("Thank you for your purchase!\nYour current balance is: " + (balance-price1) + "$");
        } else if (item.equals("charger")) {
            System.out.println("Thank you for your purchase!\nYour current balance is: " + (balance - price2) + "$");
        } else if (item.equals("hat")) {
            System.out.println("Thank you for your purchase!\nYour current balance is: " + (balance - price3) + "$");
        } else if (item.equals("headphones")) {
            System.out.println("Thank you for your purchase!\nYour current balance is: " + (balance - price4) + "$");
        } else if (item.equals("laptop")) {
            System.out.println("Sorry, not enough funds on your gift card!");
        } else if (item.equals("pants")) {
            System.out.println("Thank you for your purchase!\nYour current balance is: " + (balance - price6) + "$");
        } else if (item.equals("pillow")) {
            System.out.println("Thank you for your purchase!\nYour current balance is: " + (balance - price7) + "$");
        } else if (item.equals("smartphone")) {
            System.out.println("Sorry, not enough funds on your gift card!");
        } else if (item.equals("socks")) {
            System.out.println("Thank you for your purchase!\nYour current balance is: " + (balance - price9) + "$");
        } else if (item.equals("USB Cable")) {
            System.out.println("Thank you for your purchase!\nYour current balance is: " + (balance - price10) + "$");
        } else {
            System.out.println("Invalid item!");
        }
        

    }
}
