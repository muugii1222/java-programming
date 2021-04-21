package office_hours.Practice_03_21_2021_ProblemSets;

public class SalaryCalculatorV2 {
    public static void main(String[] args) {
        double hourlyRate = 25;
        int weeklyHours = 40;
        int numberOfWeeks = 52;

        boolean hourlyRateIsValid = hourlyRate > 0 ;
        boolean weeklyHoursIsValid = weeklyHours > 0 && weeklyHours <= 65;
        boolean numberOfWeeksIsValid = numberOfWeeks > 0 && numberOfWeeks <= 52;

        if (hourlyRateIsValid){

            if (weeklyHoursIsValid){

                if (numberOfWeeksIsValid) {
                    double salary = hourlyRate * weeklyHours * numberOfWeeks;
                    System.out.println("salary = $" + salary);

                } else {
                    System.out.println("Number of weeks cannot be less than 1 or greater than 52");
                }

            } else {
                System.out.println("Weekly Hours cannot be less than 1 or greater than 65");
            }

        } else {
            System.out.println("Hourly Rate cannot be Negative or Zero");
        }
    }
}
