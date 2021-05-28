package day47_constructors;

public class Address {

        private String street;
        private String city;
        private String state;
        private int zipCode;
        private String country = "USA";

        //constructor - automatically called
        public Address(){
            System.out.println("Address constructor");
            street = "123 unknown st";
            city = "Unknown";
            state = "WS";
            zipCode = 00000;
        }
        public Address(String street, String city, String state, int zipCode) {
            setStreet(street);//reuse the code in the setter method
            this.city = city;
            this.state = state;
            this.zipCode = zipCode;
        }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
            if (street.isEmpty() || street.length() > 50){
                System.out.println("ERROR");
            } else {
                this.street = street;
            }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return street + ", " + city + ", " + state + ", " + zipCode;
    }
}
