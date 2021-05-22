package day46_encapsulation;

public class Bank {
    public static void main(String[] args) {

        CheckingAccount account = new CheckingAccount();

        account.setBalance(453.44);
        account.setAccountNumber(1234567890);
        account.setAccountHolder("Mugi");
        account.setType("checking");

        System.out.println(account);

    }
}
