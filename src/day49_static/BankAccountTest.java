package day49_static;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount husband = new BankAccount();
        husband.user = "husband";
        husband.showBalance();
        husband.spend(100.0);
        husband.showBalance();

        BankAccount wife = new BankAccount();
        wife.user = "wife";
        wife.showBalance();
        wife.spend(400.0);
        wife.showBalance();
        husband.showBalance();

    }
}
