package office_hours.Loop_Practice_3;

/*
Unique characters Given a String, find and print the unique characters. A character is unique if it only appears once in the String.
Ex:AAABCCDEEF
Output:BDF
 */
public class UniqueCharacter {
    public static void main(String[] args) {

        String word = "AAABCCDEEF";
        String unique = "";

        for (int i = 0; i <= word.length()-1; i++){

            if (!unique.contains(word.charAt(i) + "")){
                unique += word.charAt(i);
            }
        }

        System.out.println(unique);
    }
}
