package day23_string_manipulation_while_loop;

public class ChainingStringMethods {
    public static void main(String[] args) {
        String word = "Wooden spoon";

        System.out.println(word.toUpperCase().toLowerCase().length()); //12

        System.out.println(word.replace(" ", "").toUpperCase());

        String city = "chicago";
        System.out.println(city.substring(0,1).toUpperCase()+city.substring(1));
        
        String city1 = "ULAANBAATAR";
        System.out.println(city1.substring(0,1).toUpperCase()+city1.substring(1).toUpperCase());
        String capitalized = city1.substring(0,1).toUpperCase()+city1.substring(1).toUpperCase();
        System.out.println("capitalized = " + capitalized);

        //.isEmpty().toUpperCase() Does not work since isEmpty is boolean
    }
}
