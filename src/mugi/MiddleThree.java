package mugi;
/*
Given a String variable word print the middle three characters if the word is an odd number of characters and has more than 5 characters. If the word does not meet the requirements print invalid.

fifteen ==> fte

apple ==> ppl

hey ==> invalid
 */
public class MiddleThree {
    public static void main(String[] args) {
//                     0123456
        String word = "republic";

        if (word.length() >= 5 && word.length() % 2 == 1){
            String start = word.substring(word.length() / 2 - 1);
            String end = start.substring(0, 3);

            System.out.println(end);

        } else {
            System.out.println("invalid");

            String ta = " sa ";
            int z = ta.charAt(ta.length());
            System.out.println(z);


        }
    }
}
