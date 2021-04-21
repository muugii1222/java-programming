package day21_string_manupulation;

public class StringIndexOf {
    public static void main(String[] args) {
//                     012345
        String word = "github project";
        System.out.println(word.indexOf("g"));
        System.out.println(word.indexOf("u"));
        System.out.println(word.indexOf("hub")); // give you where is h located
        System.out.println(word.indexOf("grass"));
        System.out.println(word.indexOf("t")); // find first t
    }
}
