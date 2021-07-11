package day61_exceptions_collections;

public class ElementaryStudentTest {
    public static void main(String[] args) {
        try {
            ElementaryStudent student1 = new ElementaryStudent();
            student1.setName("Anir");
            student1.setAge(1);
            System.out.println(student1.toString());
        } catch (Exception e) {
            e.printStackTrace(); //PRINT ERROR AND CONTINUE
        }

//       TRY AND CATCH auto generate: Code -> Surround with -> try/catch

        System.out.println("--- EXECUTION COMPLETED ---");
    }

}
