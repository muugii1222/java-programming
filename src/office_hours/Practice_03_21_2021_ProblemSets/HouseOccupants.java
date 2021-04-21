package office_hours.Practice_03_21_2021_ProblemSets;
/*
Given a house type (String) print out the number of max occupants (int)

Tree house: 1 Mobile home: 2 Apartment: 4 Town house: 6 Villa: 8 Mansion: 10

-> Try to use variables instead of printing multiple times
 */
public class HouseOccupants {
    public static void main(String[] args) {
        String houseType = "Villa";

        switch (houseType) {
            case "Tree house":
                int numberOfMaxOccupants1 = 1;
                System.out.println(numberOfMaxOccupants1);
                break;
            case "Mobile home":
                int numberOfMaxOccupants2 = 2;
                System.out.println(numberOfMaxOccupants2);
                break;
            case "Apartment":
                int numberOfMaxOccupants3 = 4;
                System.out.println(numberOfMaxOccupants3);
                break;
            case "Town house":
                int numberOfMaxOccupants4 = 6;
                System.out.println(numberOfMaxOccupants4);
                break;
            case "Villa":
                int numberOfMaxOccupants5 = 8;
                System.out.println(numberOfMaxOccupants5);
                break;
            case "Mansion":
                int numberOfMaxOccupants6 = 10;
                System.out.println(numberOfMaxOccupants6);
                break;
        }
    }
}

