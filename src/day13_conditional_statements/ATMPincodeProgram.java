package day13_conditional_statements;

public class ATMPincodeProgram {
    public static void main(String[] args) {
        System.out.println("***** WELCOME TO TD BANK ATM ******");
        int secretPincode = 1111;
        int inputPincode = 1111;

        System.out.println();
        if (secretPincode == inputPincode) {
            System.out.println("Welcome to your account\nYou can withdraw, check balance, deposit");
        } else {
            System.out.println("Incorrect pin code! Please try again.");
        }
        System.out.println();
        System.out.println("*** THANK YOU FOR USING TD BANK ***");
    }
}
