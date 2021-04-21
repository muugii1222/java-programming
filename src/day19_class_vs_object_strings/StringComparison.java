package day19_class_vs_object_strings;

public class StringComparison {
    public static void main(String[] args) {
        String city = "Chicago";

//        EQUALS() method -> case sensitive comparison
        System.out.println(city.equals("Chicago"));     //true
        System.out.println(city.equals("chicago"));     //false
        System.out.println(city.equals("Chicago "));    //false


//        EQUALS IGNORE CASE method -> case insensitive comparison
        System.out.println(city.equalsIgnoreCase("Chicago"));   //true
        System.out.println(city.equalsIgnoreCase("CHICAGO"));   //true
        System.out.println(city.equalsIgnoreCase("ChiCago"));   //true
        System.out.println(city.equalsIgnoreCase("Chiicago"));  //false cuz charactor different
        System.out.println(city.equalsIgnoreCase("Chi cago"));  //false cuz charactor different

        if (city.equals("CHICAGO")){
            System.out.println("equals() true ");
        } else {
            System.out.println("equals() false ");
        }                                               //false

        if (city.equalsIgnoreCase("CHICAGO")){
            System.out.println("equals() true ");
        } else {
            System.out.println("equals() false ");
        }                                               //true


    }
}
