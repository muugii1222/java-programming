package office_hours.Practice_06_15_2021;

public class EmailObject {
    public static void main(String[] args) {
        Email email = new Email("muugii1222@yahoo.com", 3);
//        email.ADDRESS = "email"; --> ADDRESS is final, cannot be changed
        System.out.println(email);
        System.out.println(Email.domain);
        System.out.println(Gmail.domain);

        Gmail gmail = new Gmail("Anir0220@gmail.com", 4);
        System.out.println("\n"+gmail);
        System.out.println(Email.domain);
        System.out.println(Gmail.domain);

        Yahoo yahoo = new Yahoo("Tamir0402@yahoo.com", 5);
        System.out.println("\n"+yahoo);
        System.out.println(Yahoo.domain);
        System.out.println(Email.domain);
        System.out.println(Gmail.domain);
    }
}
