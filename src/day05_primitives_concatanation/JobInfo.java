package day05_primitives_concatanation;

public class JobInfo {
    public static void main(String[] args){
        String title = "Java SDET";
        String company = "Amazon";
        String jobDescription = "Experience in Java, Selenium, Cucumber, Junit";
        double salary = 140000;
        byte yearExp = 2;
        boolean hasBenefit = true;

        System.out.println("Title:\t\t\t\t\t" + title);
        System.out.println("Company name:\t\t\t" + company);
        System.out.println("Job description:\t\t" + jobDescription);
        System.out.println("Salary\t\t\t\t\t$" + salary);
        System.out.println("Years of experience:\t" + yearExp);
        System.out.println("Has benefit?\t\t\t" + hasBenefit);


    }
}
