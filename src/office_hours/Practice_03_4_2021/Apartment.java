package office_hours.Practice_03_4_2021;

/*
create a class named Apartment
create a main method

    Create the variables with the most appropriate datatype:

        - address, name of owner, number of units, average size of each unit, monthly rent amount, number of washers and driers, allows pets or not, has a pool, length of lease, total number of residents in building, phone number of owner, is near a gas station, number of floors, has a basement, has available units for rent, has air conditioning, number of parking spaces, has wheel chair access, number of review stars (out of 5)

        - Create these variables and use previous variables to get the values

            - monthly rent after 3 years (discount 10% off original rent)
            - monthly rent after 6 years (discount 20% off original rent)
            - Average number of residents per unit (total residents / number of units)
            - Average number of parking spots per unit ( parking spots / units)
            - Average number of units per floor ( units / number of floors)
 */
public class Apartment {
    public static void main(String[] args) {
        String address  = "1114 N Knollwood Dr, Schaumburg, IL";
        String owner = "Munkhjargal";
        byte units = 40;
        int averageUnitSize = 950;
        int monthlyRent = 1250;
        byte washerAndDriers = 12;
        boolean allowsPet = true;
        boolean hasPool = true;
        byte lengthOfLease = 12;
        short totalResidents = 100;
        long ownerNumber = 3125600000L;
        boolean isNearGasStation = true;
        byte floors = 4;
        boolean hasBasement = true;
        boolean hasAvailableUnits = true;
        boolean hasAirConditioning = true;
        short parkingSpace = 40;
        boolean hasWheelChairAccess = true;
        byte reviewStar = 5;

        double monthlyRentAfter3Years = monthlyRent - monthlyRent * 0.1;
        double monthlyRentAfter6Years = monthlyRent - monthlyRent * 0.2;
        double averageNumberOfResidentsPerUnit = totalResidents / units;
        double averageNumberOfParkingSpotsPerUnit = parkingSpace / units;
        double AverageNumberOfUnitsPerFloor = units / floors;

        System.out.println("********** Wooden Apartment **********");
        System.out.println();
        System.out.println("Address:\t\t\t\t\t\t\t\t" + address);
        System.out.println("Name of owner:\t\t\t\t\t\t\t" + owner);
        System.out.println("Number of units:\t\t\t\t\t\t" + units);
        System.out.println("Average size of each unit:\t\t\t\t" + averageUnitSize + " sq ft");
        System.out.println("Monthly rent amount:\t\t\t\t\t$" + monthlyRent);
        System.out.println("Number of washers and driers:\t\t\t" + washerAndDriers);
        System.out.println("allows pets or not:\t\t\t\t\t\t" + allowsPet);
        System.out.println("Has a pool:\t\t\t\t\t\t\t\t" + hasPool);
        System.out.println("Length of lease:\t\t\t\t\t\t" + lengthOfLease + " months");
        System.out.println("Total number of residents in building:\t" + totalResidents);
        System.out.println("Phone number of owner:\t\t\t\t\t" + ownerNumber);
        System.out.println("Is near a gas station?\t\t\t\t\t" + isNearGasStation);
        System.out.println("Number of floors:\t\t\t\t\t\t" + floors);
        System.out.println("Has a basement:\t\t\t\t\t\t\t" + hasBasement);
        System.out.println("Has available units for rent:\t\t\t" + hasAvailableUnits);
        System.out.println("Has air conditioning:\t\t\t\t\t" + hasAirConditioning);
        System.out.println("Number of parking spaces:\t\t\t\t" + parkingSpace);
        System.out.println("Has wheel chair access:\t\t\t\t\t" + hasWheelChairAccess);
        System.out.println("Number of review stars (out of 5):\t\t" + reviewStar);

        System.out.println("Monthly rent after 3 years:\t\t\t\t$" + monthlyRentAfter3Years);
        System.out.println("Monthly rent after 6 years:\t\t\t\t$" + monthlyRentAfter6Years);
        System.out.println("Average number of residents per unit:\t" + averageNumberOfResidentsPerUnit);
        System.out.println("Average number of parking spots per unit:\t" + averageNumberOfParkingSpotsPerUnit);
        System.out.println("Average number of units per floor:\t\t" + AverageNumberOfUnitsPerFloor);



    }
}
