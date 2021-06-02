package day49_static;

public class BankAccount {

    static double balance = 500;
    String user;

   public void spend (Double amount){
        balance-=amount;
       System.out.println(user + " spent " + amount);
    }
    static void showBalance(){
        System.out.println("Current balance = " + balance);
    }

}
