package day15_logicalops_switch_ternary;

public class CitySelector {
    public static void main(String[] args) {
        String city = "Chicago";

        if (city.equals("Chicago") || city.equals("Ulaanbaatar")) {
            System.out.println("Willing to relocate to " + city);
        } else {
            System.out.println("Not considering -" + city);
          }

        String teacher = "Murodil";
        if (teacher.equals("Saim") || teacher.equals("Murodil")) {
            System.out.println("It is Java Class with " + teacher);
        } else {
            System.out.println("Soft skill class with " + teacher);
        }


        if (teacher.equals("Saim") || teacher.equals("Murodil")) {
            System.out.println("It is Java Class with " + teacher);
        } else if (teacher.equals("Nadir")) {
            System.out.println("Soft skill class with " + teacher);
        } else if (teacher.equals("Akbar")) {
            System.out.println("Some class with " + teacher);
        }


        String company = "NadirTech";  //try to change company and salary
        double salary = 80_000;

        if (company.equals("Google") || salary >= 100_000) {
            System.out.println("I'll take offer right away from " + company);
        } else {
            System.out.println("I'll think about " + company);
        }

        char grade = 'A';

        if (grade == 'A' || grade == 'B' || grade == 'C') {
            System.out.println(grade + " Passed with grade");
        } else if (grade == 'D'){
            System.out.println(grade + " Quality for retake");
        } else if (grade == 'E'){
            System.out.println(grade + " Fail!");
        } else {
            System.out.println(grade + " Invalid grade!");
        }


     }
}

