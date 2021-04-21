package office_hours.Practice_03_16_2021_Homework;
/*
[Field Trip]

Your school goes on a Field trip each year. The place you go will be based on your grade.
Given some grade number (1-6) figure out the details of your field trip. Print the information at the end.

    Data based on grade:
 */
public class FieldTrip_Switch {
    public static void main(String[] args) {

        byte grade = 1;

        switch (grade){
            case 1:
                System.out.println("location - Apple orchard\n" + "number of groups - 3\n" + "teacher in charge - Ms. Smith");
                break;
            case 2:
                System.out.println("location - Zoo\n" + "number of groups - 7\n" +  "teacher in charge - Mr. Lee");
                break;
            case 3:
                System.out.println("location - Aquarium\n" + "number of groups - 5\n" + "teacher in charge - Ms. Wilson");
                break;
            case 4:
                System.out.println("location - Movie theater\n" + "number of groups - 2\n" + "teacher in charge - Ms. Reyes");
                break;
            case 5:
                System.out.println("location - Museum\n" + "number of groups - 5\n" + "teacher in charge - Ms. Lela");
                break;
            case 6:
                System.out.println("location - Six Flags\n" + "number of groups - 8\n" + "teacher in charge - Mr. Watt");

        }


    }
}
