package day35_methods_with_param;


public class MethodWithInputs {
    public static void main(String[] args) {
        displayValue(15);
        greatByName("Mugi");
        greatByName("Tamir");
        greatByName("Bagi");
        greatByName("Anir");
    }

    public static void displayValue (int num){
        System.out.println("value is " + num);
    }

    public static void greatByName(String name){
        System.out.println("Hello " + name + ", how are you today?");
    }
}
