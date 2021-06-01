package mugi;

import day48_constructors_static.Customer;

public class Customer_group {

    private String name;
    private int id;

    public Customer_group(){

    }

    public Customer_group(String name, int id){

    }

    public Customer_group(int id, String name){

    }

    public static void main(String[] args) {

        Customer_group customerObject = new Customer_group();

        Customer_group customer1 = new Customer_group("Mugi", 12);

        customer1.id = 5;
        customer1.name = "Bagi";

        Customer_group customer2 = new Customer_group(123, "Valerii");
    }



}


