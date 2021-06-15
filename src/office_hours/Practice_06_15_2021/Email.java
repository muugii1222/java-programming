package office_hours.Practice_06_15_2021;

public class Email {
    final String ADDRESS;
    int numOfEmail;
    static String domain;

    static {
        domain = "generic";
    }

    public Email(String address, int numOfEmail){
        this.ADDRESS = address;
        this.numOfEmail = numOfEmail;

    }

    public static void sendEmail(){
        System.out.println("Sending from PARENT");
    }

    @Override
    public String toString() {
        return "Email{" +
                "Address='" + ADDRESS + '\'' +
                ", numOfEmail=" + numOfEmail +
                ", domain=" + domain +
                '}';
    }

}
