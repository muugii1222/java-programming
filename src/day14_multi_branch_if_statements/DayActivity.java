package day14_multi_branch_if_statements;

public class DayActivity {
    public static void main(String[] args) {
        String weather = "warm";

        //weather ->  "sunny", "rainy", "snowy", "windy" ...

        if (weather.equals("sunny")) {
            System.out.println("Go to park");
        } else if (weather.equals("rainy")) {
            System.out.println("Enjoy the rain");
        } else if (weather.equals("snowy")) {
            System.out.println("To build snowman, and drink hot chocolate");
        } else if (weather.equals("windy")) {
            System.out.println("Stay home, watch a movie");
        } else {
            System.out.println("Just keep going Java");
        }
    }
}
