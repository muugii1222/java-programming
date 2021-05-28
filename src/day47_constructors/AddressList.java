package day47_constructors;

public class AddressList {
    public static void main(String[] args) {
        Address myAddress = new Address();
        myAddress.setStreet("1114 N Knollwood Dr, Apt C");
        myAddress.setCity("Schaumburg");
        myAddress.setState("IL");
        myAddress.setZipCode(60194);

        System.out.println("My address: " + myAddress.toString());

        myAddress.setStreet("N Berlin St");
        System.out.println(myAddress.getStreet());

        Address newAddress = new Address();
        System.out.println(newAddress.toString());
        newAddress.setStreet("1114 N Knollwood Dr, Apt C");
        newAddress.setCity("Schaumburg");
        newAddress.setState("IL");
        newAddress.setZipCode(60194);
        System.out.println("After set" + newAddress.toString());

        Address costco = new Address("1375 N Meacham Rd,", "Schaumburg", "IL", 60173);
        System.out.println("costco address: " + costco.toString());
    }
}
