package day49_static;

public class StaticMethods {

        int num = 10;
        static int count = 5;
// static called
    public static void  displayMessage(String message){
            System.out.println("message: " + message);
//            System.out.println("num = " + num); --> ERROR: num is instance variable
            System.out.println("count = " + count); // --> OKAY: count is static variable
    }

    public static void anotherStaticMethod(){
        System.out.println("another static method");
        displayMessage("wooden spoon");
    }

    public void instanceMethod(){
        System.out.println("instanceMethod");
        System.out.println(num);
        System.out.println(count);
        displayMessage("hello from instance method");

    }

}
