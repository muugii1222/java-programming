package day39_wrapper_classes;

public class WrapperClassMethods {
    public static void main(String[] args) {
        System.out.println(Integer.max(10, 5));
        System.out.println(Integer.min(5, 2));
        System.out.println(Integer.sum(50, 35));
        System.out.println("MIN INT: " + Integer.MIN_VALUE);
        System.out.println("MAX INT: " + Integer.MAX_VALUE);


        System.out.println(Double.max(345.4, 34.4));
        System.out.println("MIN DOUBLE: " + Double.MIN_VALUE);
        System.out.println("MAX DOUBLE: " + Double.MAX_VALUE);

        System.out.println(Double.compare(5, 1)); //1 -> first one larger than second
        System.out.println(Double.compare(5, 5)); //0 -> both equal
        System.out.println(Double.compare(1, 5)); //-1 -> second one larger than first

        System.out.println(Character.isDigit('8')); // true
        System.out.println(Character.isDigit('v')); //false
        System.out.println(Character.isAlphabetic('Q')); //true
        System.out.println(Character.isLetter('r')); //

        char letter = 'A';
        if (Character.isUpperCase(letter)){
            System.out.println("It is uppercase");
        }

        String word = "JaVa iS FuN";
        for (int i = 0; i < word.length(); i++){
            if (Character.isUpperCase(word.charAt(i))){
                System.out.print(word.charAt(i));
            }

//            if (Character.isLowerCase(word.charAt(i))){
//                System.out.print(word.charAt(i));
//
//            }
        }
        System.out.println();
        System.out.println(Boolean.TRUE);
        System.out.println(Boolean.TRUE.equals(5<3));
    }
}
