package day51_inheritance;

public class EmployeeObjects {
    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.jobTitle = "SDET";
        System.out.println(employee);
        double AnnualSalaryEmp = employee.calculateSalary(45.0);
        System.out.println("SDET Annual Salary = $" + Math.round(AnnualSalaryEmp));


        Contractor contractor = new Contractor();
        contractor.jobTitle = "Tester";
        System.out.println(contractor);
        double AnnualSalaryCont = contractor.calculateSalary(45);
        System.out.println("Tester Annual Salary = $" + AnnualSalaryCont);

    }
}
