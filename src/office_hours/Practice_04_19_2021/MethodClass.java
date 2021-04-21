package office_hours.Practice_04_19_2021;

public class MethodClass {

    public static void methodOne (){
        System.out.println("One");  // no return, only run block of code
    }

    public static String methodTwo (){  // have return (code is reusable, can declare, do some action with this code), run block of code
        return "Two";
    }

    public static int methodThree (String word){ // with parameter/input
        return word.length();
    }

    public static boolean login (String userName, String password){ // with parameters/inputs
        return true;
    }

}
