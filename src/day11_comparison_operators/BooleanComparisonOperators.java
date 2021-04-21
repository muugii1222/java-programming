package day11_comparison_operators;

public class BooleanComparisonOperators {
    public static void main(String[] args) {
        System.out.println(10 == 10);
        System.out.println(1000 > 100);
        System.out.println(800 < 9000);
        System.out.println(10 <= 11);
        System.out.println(5 >= 3);
        System.out.println(- 100 != 44);

        int a = 100;
        int b = 200;
        System.out.println(a == b); //false
        System.out.println(a > b);  //false
        System.out.println(a < b);  //true
        System.out.println(a >= b); //false
        System.out.println(a <= b); //true
        System.out.println(a != b); //true

        boolean result = 5 == 5;
        System.out.println("result = " + result);
        
        result = 33 > 44;
        System.out.println("result = " + result);
        
        result = 88 < 99;
        System.out.println("result = " + result);
        
        result = 10 >= 10;
        System.out.println("result = " + result);
        
        result = 123 <= 124;
        System.out.println("result = " + result);
        
        result = 2 != 2;
        System.out.println("result = " + result);

        String city = "Chicago";
        System.out.println(city == "Chicago");
        System.out.println(city == "Schaumburg");
        
        String name = "Nadir";
        boolean checkName = name == "Nadir";
        System.out.println("checkName = " + checkName);
        
        checkName = name != "Murodil";
        System.out.println("checkName = " + checkName);

        int age = 4;
        boolean noMoreToddler = age > 4;
        System.out.println("noMoreToddler = " + noMoreToddler);

        age = 66;
        boolean seniorCitizen = age >= 66;
        System.out.println("seniorCitizen = " + seniorCitizen);





    }
}
