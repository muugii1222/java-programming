package day13_conditional_statements;

public class StringComparison {
    public static void main(String[] args) {
        String city = "Los Angeles";
        if (city.equals("Los Angeles")) {
            System.out.println("It is LA");
        } else {
            System.out.println("It is not LA");
        }

        String weather = "sunny";
        if (weather.equals("sunny")) {
            System.out.println("It is hot");
        } else {
            System.out.println("It is not hot");
        }
    }
}