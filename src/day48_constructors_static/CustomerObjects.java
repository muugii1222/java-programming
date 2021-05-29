package day48_constructors_static;

import java.util.ArrayList;
import java.util.List;

public class CustomerObjects {
    public static void main(String[] args) {
        Customer cs1 = new Customer();
        System.out.println(cs1.toString()); //print with default value that are set in no-args constructors
        cs1.setId(1);
        cs1.setName("Bob");
        System.out.println(cs1);

        Customer cs2 = new Customer("Mike", 2); //short way
        Customer cs3 = new Customer("John", 4873);
        System.out.println(cs2);
        System.out.println(cs3);

        //array of customers
        Customer[] todayCustomers = {cs1, cs2, cs3, new Customer("Bashir", 449)};

        List<Customer> customerList = new ArrayList<>();
        customerList.add(cs1);
        customerList.add(cs2);
        customerList.add(cs3);
        customerList.add(new Customer("Bashir", 449));
        customerList.add(new Customer("Suleyman", 9763));

        //Print info of first customer object in array and arrayList
        System.out.println(todayCustomers[0]);
        System.out.println(customerList.get(0));

        System.out.println(customerList);

        System.out.println("----- FOR LOOP -----");
        for (int i = 0; i < customerList.size(); i++) {
            System.out.println(customerList.get(i));
        }

        System.out.println("----- FOR EACH LOOP -----");
        for (Customer each : customerList) {
            System.out.println(each);
        }

        //print only names of Customers in the list
        System.out.println("----- NAMES OF CUSTOMERS -----");
        for (Customer each : customerList) {
            System.out.println(each.getName());
        }

        System.out.println("using Lambda expression");
        customerList.forEach(each -> System.out.println(each.getName()));

    }
}
