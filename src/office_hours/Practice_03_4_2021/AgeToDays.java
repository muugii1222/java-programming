package office_hours.Practice_03_4_2021;

/*
Make a class AgeToDays
create a main method

    - Declare two int variables: age and age in days

    - Use a base of 365 days in a year

    - Calculate and display:
        You are $age years old! That means you are $days days old
 */
public class AgeToDays {
    public static void main(String[] args) {
        byte age = 34;
        int year = 365;
        int ageInDays = age * year;


        System.out.println("You are " + age + " years old! That means you are " + ageInDays + " days old.");
    }
}
