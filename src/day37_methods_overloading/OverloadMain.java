package day37_methods_overloading;

import java.util.Arrays;

public class OverloadMain {
    public static void main(String[] args) {
        System.out.println("Hello World");

        main(19871222);
    }

    // WE CAN OVERLOAD MAIN METHOD TOO (SAME NAME, DIFFERENT PARAMETERS)
    //BUT THIS MAIN METHOD DOESN'T RUN UNLESS CALL IT
    public static void main(int num) {
        System.out.println("num = " + num);
    }
}
