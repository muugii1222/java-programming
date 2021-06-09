package day51_inheritance;

public class Contractor extends Employee{

    @Override //optional
    public double calculateSalary(double hourlyRate){
        return 50 * 40 * hourlyRate;

    }

    @Override
    public String toString() {
        return "Contractor{" +
                "jobTitle='" + jobTitle + '\'' +
                '}';
    }
}
