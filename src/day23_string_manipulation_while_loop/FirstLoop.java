package day23_string_manipulation_while_loop;

public class FirstLoop {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {
            System.out.println(i);   // infinity -> keep printing -> cuz condition is always true
            i++;                     // add 1 after each print until boolean goes false
        }

        int apples = 0;
        while (apples <= 10) {
            System.out.println("apple -> " + apples);
            apples++;
        }

        System.out.println("apples = " + apples); // 10 + 1

//        infinite loop
        while (true) {                          // condition is always true
            System.out.println("Hello World");

        }
        
    }
}
