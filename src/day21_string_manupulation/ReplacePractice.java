package day21_string_manupulation;
/*
String word = "github";
System.out.println(word.toUpperCase());
    OUTPUT:
        "GITHUB"
 */
public class ReplacePractice {
    public static void main(String[] args) {
        String word = "github";
        System.out.println(word.toUpperCase());
        System.out.println(word.replace("hub", "lab"));
        System.out.println("word = " + word);

        word = word.replace("hun", "lab");
        System.out.println("word = " + word);

//        gitlab
//        i -> o a -> i
        System.out.println(word.replace('i', 'o').replace('a', 'o'));

        String sentence = "java is fun";
        String withNoSpaces = sentence.replace(" ", "");
        System.out.println("withNoSpaces = " + withNoSpaces);

//
//        sentence = sentence.replace("java", "selenium");
//        sentence = sentence.replace("fun", "a lot of fun");

//        we can chaining it for 1 statement
        sentence = sentence.replace("java", "selenium")
                           .replace("fun", "a lot of fun");
        System.out.println("sentence = " + sentence);



        String result = "1-48 of over 4,000 results for java book";
        System.out.println("result = " + result);

        result = result.replace("1-48 of over ", "")
                       .replace(" results for java book", "");
        System.out.println("result = " + result);
    }
}