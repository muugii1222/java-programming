package mugi.unit3_Practice;

public class Method {
    public static void main(String[] args) {

        displayMessage1();
        displayValue("Mugi");
        displayValue1(345);
        System.out.println(name());
        System.out.println(add(23, 33));
        System.out.println(num(23));


    }

//    Void method without parameter
    public static void displayMessage1 (){
        System.out.println("hello world");
    }

    public static void displayValue (String str){
        System.out.println(str);
    }

    public static void displayValue1 (int num){
        System.out.println(num);
    }

    public static String name (){
        return "Mugi";
    }

    public static int add (int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }

    public static int num (int num){
        return num;
    }


}
