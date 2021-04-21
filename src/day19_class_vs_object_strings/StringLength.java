package day19_class_vs_object_strings;

public class StringLength {
    public static void main(String[] args) {
        String city = "Chicago";
        System.out.println(city);
        System.out.println(city.length());
        System.out.println("count: " + city.length());

        System.out.println("wooden spoon".length());

        String firstName = "Munkhjargal";
        System.out.println(firstName + " - " + firstName.length());

        int count = firstName.length();
        System.out.println("count = " + count);

        String password = "abc123";

        if (password.length() >= 6 ){
            System.out.println("Valid Amazon password");
        } else {
            System.out.println("Password too short");
        }

    }
}
