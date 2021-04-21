package office_hours.Practice_03_3_2021;

/* Create a class Employee
create a main method

    Declare and assign these variables according to the most appropriate datatypes: (Use as many datatypes as you can for practice)

        - first name, last name, company name, salary, start day, start month, start year, are they full time, job title, office address,

    Declare new variables and use concatenation from previous variables to set their values

        - full name (first and last name)
        - full start date (start month date, year)
        - email (first name + start day @ $company name .com)
        - Salary after 3 years (base salary + start month * 10000)
            Ex: base: 100000
                start day: 2
                after 3 year: (100000 + (2 * 1000)) = 102000

    Display the values of the variables following given example image

 */

public class Employee {
    public static void main(String[] args) {
        String firstName = "Munkhjargal";
        String lastName = "Battsooj";
        String companyName = "Google";
        double salary = 150000;
        byte startDate = 1;
        byte startMonth = 1;
        short startYear = 2021;
        boolean fullTime = true;
        String jobTitle = "Software Developer Engineer in test";
        String officeAddress = "Google's headquarters is located at 1600 Amphitheatre Parkway " +
                "in Mountain View, California, United States.";

        String fullName = firstName + " " + lastName;
        String fullStartDate = startMonth + "." + startDate + "." + startYear;
        String eMail = firstName + startDate + "@" + companyName + ".com";
        double salaryAfter3Years = salary + startMonth * 10000;

        System.out.println("******** GOOGLE New Hire Information ********");
        System.out.println();
        System.out.println("Your start date as a SDET will be on " + fullStartDate + "\nYou are full time: "
                + fullTime + " and will be making $" + salary + " per year. \nThe office is located at: " + officeAddress);
        System.out.println();
        System.out.println("               Official Information:     ");
        System.out.println();
        System.out.println("New hire name:\t\t\t\t\t\t" + fullName);
        System.out.println("Starts on:\t\t\t\t\t\t\t" + fullStartDate);
        System.out.println("Email generated:\t\t\t\t\t" + eMail);
        System.out.println("Your expected salary after 3 years:\t$" + salaryAfter3Years);

    }
}
