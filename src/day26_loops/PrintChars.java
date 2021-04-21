package day26_loops;

public class PrintChars {
    public static void main(String[] args) {
        String word = "munkhjargal";

        for (int i = 0; i < word.length(); i++) {
            System.out.print(word.charAt(i));
        }
        System.out.println();

        for (int i = word.length()-1; i <= 0; i--) {
            System.out.print(word.charAt(i));
        }





//        System.out.println(word.length());

//        System.out.println(word.charAt(0)); //j
//        System.out.println(word.charAt(1)); //a
//        System.out.println(word.charAt(2)); //v
//        System.out.println(word.charAt(3)); //a



    }
}
