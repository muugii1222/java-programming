package office_hours.Loop_Practice_3;

/*
[IQ] Duplicate characters

Given a String, find and print the duplicate characters. A character is duplicate if it appears more than once in the String.
Ex:AAABCCDEEF
Output:ACE

 */
public class DuplicateCharacter {
    public static void main(String[] args) {
        String str = "AAABCCDEEF";
        String checked = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;

            if (checked.contains("" + str.charAt(i))){
                continue;
            }

            for (int j = 0; j < str.length(); j++) {

                if(str.charAt(i) == str.charAt(j)) { // A == A  A == B  A == C  A == D
                    count++;
                }
            }

            if (count > 1){
                System.out.print(str.charAt(i));
            }

            checked +=str.charAt(i);
        }

    }
}
