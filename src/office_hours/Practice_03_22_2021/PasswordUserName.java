package office_hours.Practice_03_22_2021;
/*
Given a username and password verify they are valid.
    - The password cannot be less than 5 characters
        -> If it is less print: "Password cannot be less than 5 characters"
        -> If it is more then or equal to 5 print: "Valid password"

    - Also the password should not contain the username
        - If the password has the username in it print:
            "Invalid password, username should not be in it"
                -> Also change the password to have the value: "password"
 */
public class PasswordUserName {
    public static void main (String[] args) {
        String userName = "muugii1222";
        String password = "i56";

        if (password.length() >=5) {

            if (password.contains(userName)) {
                System.out.println("Invalid password, username should not be in it");
            } else {
                System.out.println("Valid password");
            }

        } else {
            System.out.println("Password cannot be less than 5 characters");
        }
    }
}
