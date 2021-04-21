package office_hours.Loop_Practice_2;

/*
Biggest substring of matching characters
Given a String find the biggest substring of chars that match and print it.

Ex: aaabbbcccccddddee
Output: ccccc

 */
public class BiggestSubstring {
    public static void main(String[] args) {

        String str = "aaabbbbbcccccddddee";
        String biggestSubstring = "";
        String temprary = "";

        for (int i = 0; i < str.length()-1; i++){

            temprary += str.charAt(i);

            if (str.charAt(i) != str.charAt(i+1)){

                if (temprary.length() > biggestSubstring.length()) {
                    biggestSubstring = temprary;
                }

                temprary = "";
            }

        }

        System.out.println("biggestSubstring = " + biggestSubstring);

    }

}

