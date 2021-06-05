package day50_inheritance;

public class Student extends Person {

    String school;

    public void study (String topic){
        System.out.println(name + " learning " + topic);
        System.out.println("age is " + age);
    }


}
