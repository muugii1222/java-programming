package office_hours.Practice_03_21_2021_ProblemSets;
/*
Given the following information: hourly rate, weekly hours, and number of weeks. Check if all the inputs are valid and then calculate the salary.

- hourly rate cannot be negative or zero

-> If invalid print: Hourly Rate cannot be Negative or Zero

- weekly hours cannot be zero, negative or more than 65

-> If invalid print: Weekly Hours cannot be less than 1 or greater than 65

- number of weeks cannot be less than 1 and more than 52

-> If invalid print: Number of weeks cannot be less than 1 or greater than 52

Equation: salary = hourly rate * weekly hours * number of weeks
 */
public class SalaryCalculator {
    public static void main(String[] args) {
        double hourlyRate = 15;
        int weeklyHours = 25;
        int numberOfWeeks = 48;
        
        if (hourlyRate > 0 ){
            
            if (weeklyHours > 0 && weeklyHours <= 65){
                
                if (numberOfWeeks > 0 && numberOfWeeks <= 52) {
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
