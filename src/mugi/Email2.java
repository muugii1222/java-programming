package mugi;
/*
Swap first name with last name in the email (Seperated by an underscore). If the email doesn't contain an underscore print the given input email.

Examples:

input: mike_tyson@gmail.com
output: tyson_mike@gmail.com

input: barakobama@gmail.com
output: barakobama@gmail.com
 */
public class Email2 {
    public static void main(String[] args) {

        String email = "mike_tyson@gmail.com";

        if (email.contains("_")){
            String firstName = email.substring(0, email.indexOf("_"));
            String lastName = email.substring(email.indexOf("_")+1, email.indexOf("@"));
            String domain = email.substring(email.indexOf("@"));

            System.out.println(lastName + "_" + firstName + domain);

        } else {
            System.out.println(email);
        }
    }
}
