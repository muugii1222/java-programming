package day47_constructors;

public class StudentObjects {
    public static void main(String[] args) {
        Student st1 = new Student();
        Student st2 = new Student();

        Student st3 = new Student("Mugi");
        Student st4 = new Student("Ana");
        Student st5 = new Student(33);
        Student st6 = new Student("Mugi", 33);

    }
}
