package mugi;

public class Vowels {
    public static void main(String[] args) {
        String word = "howdyho";
        String vowels = "";
        //write your code below
        for (int i = 0; i < word.length() - 1; i++) {
            if (word.contains("o")) {
                vowels += 1;
            }
        }
        System.out.println(vowels);
    }
}