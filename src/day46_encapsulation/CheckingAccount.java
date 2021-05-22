package day46_encapsulation;

public class CheckingAccount {
    private double balance;
    private int accountNumber;
    private String accountHolder;
    private String type;

    /**
     * public void setAccountInfo(long accountNumber,String accountHolder, double balance,String type)
     * 1) this.accountNumber = accountNumber;
     * 2) setAccountNumber(accountNumber);
     */


//    shortcut -> command + n -> getter and setter

    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public void setAccountHolder(java.lang.String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "balance=" + balance +
                ", accountNumber=" + accountNumber +
                ", accountHolder='" + accountHolder + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

//    public void setAccountInfo(double balance, int accountNumber, String accountHolder, String type){
//        return setAccountInfo;
//    }
}
