package office_hours.Practice_03_22_2021;
/*
Given two String variables. One is a full name and the second a last name. Check if the full name has the same last name as the other String.
    Ex:
        s: "james bond"
        s: "bond"
        output: Same last name

        s: "alex benji"
        s: "bond"
        output: Not the same last name
 */
public class NameCheck {
    public static void main(String[] args) {

        String fullName = "Munkhjargal Battsooj";
        String lastName = "Battsooj";

        if (fullName.contains(lastName)){
            System.out.println("Same last name");
        } else {
            System.out.println("Not the same last name");
        }
    }

}
