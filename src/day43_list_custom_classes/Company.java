package day43_list_custom_classes;

public class Company {
    public static void main(String[] args) {
        Employee person1 = new Employee();
        person1.name = "Mugi";
        person1.jobTitle = "SDET";
        person1.work();
        System.out.println(person1.name);
        System.out.println(person1.jobTitle);

        Employee person2 = new Employee();
        person2.name = "Ana";
        person2.jobTitle = "SDET";
        person2.work();
        System.out.println(person2.name);
        System.out.println(person2.jobTitle);

        Employee person3 = new Employee();
        person3.name = "Ally";
        person3.jobTitle = "Developer";
        person3.work();
        System.out.println(person3.name);
        System.out.println(person3.jobTitle);




    }







}