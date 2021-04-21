package day16_switch_ternary;
/*
#### WELCOME TO ADAIRE APARTMENTS ####

numberOfBedrooms = 0, 1, 2

startingPrice = 0;

when numberOfBedrooms 0:
    print: "Studio apartment selected"
    startingPrice -> 1454

when numberOfBedrooms 1:
    print: "One bedroom apartment selected"
    startingPrice -> 1725

when numberOfBedrooms 2:
    print: "Two bedroom apartment selected"
    startingPrice -> 2899

------
"Starting price $1454"

 */
public class ApartmentLease {
    public static void main(String[] args) {
        byte numberOfBedrooms = 1;
        double startingPrice = 0.0;

        System.out.println("#### WELCOME TO ADAIRE APARTMENTS ####");
        switch (numberOfBedrooms) {
            case 0 :
                System.out.println("Studio apartment selected");
                startingPrice = 1454;
                break;
            case 1 :
                System.out.println("One bedroom apartment selected");
                startingPrice = 1725;
                break;
            case 2 :
                System.out.println("Two bedroom apartment selected");
                startingPrice = 2899;
                break;
            default:
                System.out.println("Currently unavailable");
//              return; exit main  method
        }
        System.out.println("Starting price: $" + startingPrice);
    }
}
