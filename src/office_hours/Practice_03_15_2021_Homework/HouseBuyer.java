package office_hours.Practice_03_15_2021_Homework;

/*
[House Buyer ] - Look at CappuccinoBuyer from class for an idea

You are buying a new house and need to collect information about the houses in a specific area.
You will give the neighborhood name and see the average house price,
rating of school districts near by(out of 5), if it is a gated community or not, allow pets or not.

Make variables for all of that information. Given empty defaults for all except the neighborhood name.
Print the information once at the end.

    Data based on neighborhood name:

        name - Hills
        average price - 89,000
        rating - 4.0
        gated - no
        allow pets - yes

        name - Oaks
        average price - 75,000
        rating - 3.5
        gated - no
        allow pets - yes

        name - Highland
        average price - 150,000
        rating - 4.5
        gated - yes
        allow pets - no

        name - Canyon
        average price - 201,000
        rating - 4.8
        gated - yes
        allow pets - yes

 */
public class HouseBuyer {
    public static void main(String[] args) {
        String neighborhoodName = "Canyon";
        int averagePrice = 0;
        double rating = 0.0;
        boolean gated = true;
        boolean allowPets = true;

        switch (neighborhoodName){
            case "Hills":
                System.out.println("House Information");
                neighborhoodName = "Hills";
                averagePrice = 89_000;
                rating = 4.0;
                gated = false;
                allowPets = true;
                break;

            case "Oaks":
                System.out.println("House Information");
                neighborhoodName = "Oaks";
                averagePrice = 75_000;
                rating = 3.5;
                gated = false;
                allowPets = true;
                break;

            case "Highland":
                System.out.println("House Information");
                neighborhoodName = "Highland";
                averagePrice = 150_000;
                rating = 4.5;
                gated = true;
                allowPets = false;
                break;

            case "Canyon":
                System.out.println("House Information");
                neighborhoodName = "Canyon";
                averagePrice = 201_000;
                rating = 4.8;
                gated = true;
                allowPets = true;
                break;
            default:
                System.out.println();
        }
        System.out.println("Neighborhood name: " + neighborhoodName + "\nAverage house price: $" + averagePrice + "\nRating of school districts near by(out of 5): "
                + rating + "\nIt is a gated community: " + gated + "\nAllow pets: " + allowPets);

    }
}
