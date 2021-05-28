package day47_constructors;

public class Student {

    private String Name;
    private int age;

    //No-Args constructor
    public Student(){
        System.out.println("No-Args constructor");
    }

    //constructor with 1 param: String name
    public Student(String name){
        System.out.println("name param constructor | name = " + name);
    }

    public Student(int age){
        System.out.println("age param constructor | age = " + age);
    }

    public Student(String name, int age){
        System.out.println("name & age param constructor | name & age = " + name + ", " + age);
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + Name + '\'' +
                ", age=" + age +
                '}';
    }
}
