package office_hours.Practice_03_31_2021;
/*
Count upper, lower, and numbersGiven a String, find and print how many uppercase letter, lowercase letter, and number are in the String.

Ex:
Input: 2juMp41EEkd4s4
Output:
3 uppercase letters
6 lowercase letters
5 numbers
 */
public class CountUpperLowerOrNumber {
    public static void main(String[] args) {

        String str = "2juMp41EEkd4s4";
        int uppercase=0, lowercase=0, number=0;

        for (int i = 0; i < str.length(); i++) {
            char eachLetter = str.charAt(i);

            if (eachLetter >= 'A' && eachLetter <= 'Z') {
                uppercase++;
            } else if (eachLetter >= 'a' && eachLetter <= 'z') {
                lowercase++;
            } else if (eachLetter >= '0' && eachLetter <= '9') {
                number++;
            }
        }

        System.out.println("uppercase = " + uppercase);
        System.out.println("lowercase = " + lowercase);
        System.out.println("number = " + number);
    }
}
