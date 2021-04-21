package day17_ternary_nested_conditions;

/*
temPrice = 30;
isPrimeMember = true;

when isPrimeMember is true
    print "Eligible for free 2 day shipping"
otherwise
    when itemPrice is more than 25
        print "Eligible for free regular shipping"
    otherwise
        print "Not eligible for free shipping. fee is $10"
 */
public class AmazonPrimeShoppping {
    public static void main(String[] args) {
        double itemPrice = 15;
        boolean isPrimeMember = false;

        if (isPrimeMember) {
            System.out.println("Eligible for free 2 day shipping");
        } else {
            if (itemPrice >= 25) {
                System.out.println("Eligible for free regular shipping");
            } else {
                System.out.println("Not eligible for free shipping. Shipping fee is $10");
            }
        }
    }
}
