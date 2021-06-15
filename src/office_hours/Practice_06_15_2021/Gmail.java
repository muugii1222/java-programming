package office_hours.Practice_06_15_2021;

public class Gmail extends Email{

    static String domain; //when to declare domain again java will hide variable that in Email

    static{
        domain = "Gmail";
    }

    public static void sendEmail(){
        System.out.println("Sending from PARENT");
    }

    public static void sendSuperEmail(){
        Email.sendEmail();
    }

    public Gmail(String address, int numOfEmail) {
        super(address, numOfEmail);
    }
}
