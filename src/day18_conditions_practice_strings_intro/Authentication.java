package day18_conditions_practice_strings_intro;
/*
last4SSN
pinCode

expLast4SSN
expPinCode
------------------------------
when both match:
    "Authentication successful"
when expLast4SSN does not match:
    "Last 4 of SSN did not match"
when pinCode does not match:
    "pinCode did not match"
 */
public class Authentication {
    public static void main(String[] args) {
        int last4ssn = 1234;
        int pinCode = 4321;

        int expLast = 1234;
        int expPinCode = 4323;

        if (last4ssn == expLast && pinCode == expPinCode) {
            System.out.println("Authentication successhul");
        } else {
            System.out.println("Authentication unsuccesshul");
            if (last4ssn != expLast) {
                System.out.println("Last 4 of SSN did not match");
            }

            if (pinCode != expPinCode){             // if use independent if statement everything will be check
                System.out.println("pinCode did not match");
            }
        }
    }
}