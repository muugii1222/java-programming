package day28_loops;

/*
Given a string retrieve
 */

public class FindUniqueChars {
    public static void main(String[] args) {

        String word = "happiness";
        String unique = "";

        for (int i = 0; i <= word.length()-1; i++){

            if (!unique.contains(word.charAt(i) + "")){
            unique += word.charAt(i);
            }
        }

        System.out.println(unique);

    }
}
