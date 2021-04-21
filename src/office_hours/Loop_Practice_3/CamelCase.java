package office_hours.Loop_Practice_3;

/*
Camel Case
Given a String of words that follow Camel Case convention. Find and print how many words are in the given String.Every word, except the first word, begin with an uppercase letter. The other characters of the word will be lowercase

Ex:
Input:thisHasManyWordsToFind
Output: 6

 */
public class CamelCase {
    public static void main(String[] args) {
        String str = "thisHasManyWordsToFind";
        int word = 1; //first word start with lowercase so count automatically that's why start with 1

        if(str.isEmpty()) {
            word = 0;
        }

        for (int i = 0; i < str.length(); i++) {
            char eachLetter = str.charAt(i);

            if (eachLetter >= 'A' && eachLetter <= 'Z') {
                word++;
            }

        }
        System.out.println(word);
    }
}