package office_hours.Practice_06_15_2021;

public class Yahoo extends Email{

    static String domain;

    static {
        domain = "Yahoo";
    }

    public Yahoo(String address, int numOfEmail) {
        super(address, numOfEmail);
    }
}
