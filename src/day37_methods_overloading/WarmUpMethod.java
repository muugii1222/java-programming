package day37_methods_overloading;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class WarmUpMethod {
    public static void main(String[] args) {
        loginVoid("cybertekStudent", "abc123"); //positive test
        loginVoid("cybertek", "abcd12"); //negative test

        System.out.println(login("cybertekStudent", "abc123"));
        System.out.println(login("cybertek", "abcd12"));

        if (login("cybertekStudent", "abc123")){
            System.out.println("Welcome to Canvas");
        } else {
            System.out.println("Please, try again");
        }

        boolean isloginSuccesfull = login("Nadir", "mountain");

        System.out.println(isloginSuccesfull);

    }


//VOID METHOD
    public static void loginVoid(String username, String password) {
        String secretUsername = "cybertekStudent";
        String secretPassword = "abc123";

        if (username.equalsIgnoreCase(secretUsername) && password.equals(secretPassword)) {
            System.out.println("Login Successful, welcome cybertekStudent");
        } else {
            System.out.println("Incorrect username or password");
        }

    }

//    RETURN METHOD --> WAY 1
    public static boolean login(String username, String password) {
        String secretUsername = "cybertekStudent";
        String secretPassword = "abc123";

        if (username.equalsIgnoreCase(secretUsername) && password.equals(secretPassword)) {
            return true;
        } else {
            return false;
        }


      /**  WAY 2. WITHOUT ELSE IS OKAY TOO

        if (username.equalsIgnoreCase(secretUsername) && password.equals(secretPassword)) {
            return true;
        }
            return false;




       WAY 3. MORE SIMPLE --> WITHOUT TRUE, FALSE

       return username.equalsIgnoreCase(secretUsername) && password.equals(secretPassword);


       */



    }
}