package day50_inheritance;

public class InheritanceTest {
    public static void main(String[] args) {

        Person p1 = new Person();
        p1.name = "Bakyt";
        p1.age = 30;

        p1.talk();
        p1.walk();
        p1.work("SDET");

        Teacher t1 = new Teacher();
        t1.teacherID = 1234;
        t1.name = "Saim";
        t1.age = 25;
        t1.talk();
        t1.teach("java inheritance");

        Student s1 = new Student();
        s1.name = "Mugi";
        s1.work("SDET");
        s1.study("java");
        s1.school = "Cybertek";
        s1.age = 40;

    }
}
