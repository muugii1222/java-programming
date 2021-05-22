package day46_encapsulation;

public class Dealership {
    public static void main(String [] args){

        Car car1 = new Car();
//        car1.model = "Acura MDX"; //Error! -> instance variable is private
//        car1.year = 2012;
//        car1.price = 35_000;

        car1.setModel("Acura MDX");
        System.out.println("car1 model = " + car1.getModel());

        car1.setYear(2012);
        System.out.println("car1 year = " + car1.getYear());

        car1.setMileage(23_000);
        System.out.println("car1 mileage = " + car1.getMileage());

        car1.setModel("Toyota Siena");
        System.out.println(car1.getModel());

        System.out.println(car1.toString());
        
        Car alfaRomeo = new Car();
        alfaRomeo.setModel("Alfa Romeo Giulia Ti AWD");
        alfaRomeo.setYear(2017);
        alfaRomeo.setMileage(16604);

        System.out.println("alfaRomeo.getModel() = " + alfaRomeo.getModel());
        System.out.println("alfaRomeo.getYear() = " + alfaRomeo.getYear());
        System.out.println("alfaRomeo.getMileage() = " + alfaRomeo.getMileage());

        System.out.println(alfaRomeo.toString());
        System.out.println(alfaRomeo); //same



    }
}
