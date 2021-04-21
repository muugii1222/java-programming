package day30_arrays;

/*
id        - 0
firstName - 1
lastName  - 2
batchNum  - 3
phoneNum  - 4

Declare student array and store 5 String values

 */
public class StudentArray {
    public static void main(String[] args) {

//      SHORTER WAY --> GOOD WHEN U DON'T KNOW SOME VARIABLES YET

        String [] student1 = {"ID1222", "Munkhjargal", "Battsooj", "B22", "312-000-0000" };

//      LONGER WAY --> GOOD WHEN U ALREADY KNOW VARIABLES

        String [] student2 = new String [5];
        student2 [0] = "ID13333";
        student2 [1] = "Adam";
        student2 [2] = "Smith";
        student2 [3] = "B22";
        student2 [4] = "312-333-3333";

        System.out.println("Student1 ID: " + student1 [0]);
        System.out.println("Student1 First Name: " + student1 [1]);
        System.out.println("Student1 Last Name: " + student1 [2]);
        System.out.println("Student1 Batch Numbers: " + student1 [3]);
        System.out.println("Student1 Phone Number: " + student1 [4]);

        System.out.println("Student1 data length: " + student1.length);

        if (student1.length == 5){
            System.out.println("Data array has correct length");
        } else {
            System.out.println("Data array has incorrect length");
        }

        System.out.println();

        System.out.println("Student2 ID: " + student2 [0]);
        System.out.println("Student2 First Name: " + student2 [1]);
        System.out.println("Student2 Last Name: " + student2 [2]);
        System.out.println("Student2 Batch Numbers: " + student2 [3]);
        System.out.println("Student2 Phone Number: " + student2 [4]);

        System.out.println("Student2 data length: " + student2.length);

        if (student2.length == 5){
            System.out.println("Data array has correct length");
        } else {
            System.out.println("Data array has incorrect length");
        }

        System.out.println();

        if (student1.length == student2.length) {
            System.out.println("Data array length match");
        } else {
            System.out.println("Data array length mismatch");
        }

        System.out.println(student1 [1].toUpperCase() + " " + student1 [2].toUpperCase());

        String mobileNumber = student1 [4];
        System.out.println(mobileNumber);

    }
}
