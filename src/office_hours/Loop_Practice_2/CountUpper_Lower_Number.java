package office_hours.Loop_Practice_2;

/*
Count upper, lower, and numbersGiven a String, find and print how many uppercase letter, lowercase letter, and number are in the String.
Ex:
Input: 2juMp41EEkd4s4
Output: 3 uppercase letters
        6 lowercase letters
        5 numbers
 */
public class CountUpper_Lower_Number {
    public static void main(String[] args) {
         String str = "2juMp41EEkd4s4";
         int countUp = 0;
         int countLow = 0;
         int countNum = 0;

         for (int i = 0; i < str.length(); i++){

             char eachLetter = str.charAt(i);

             if (eachLetter >= 'A' && eachLetter <= 'Z'){
                 countUp++;
             } else if (eachLetter >= 'a' && eachLetter <= 'z'){
                 countLow++;
             } else if (eachLetter >= '0' && eachLetter <= '9' ) {
                 countNum++;
             }
         }

        System.out.println(countUp + " Uppercase letters");
        System.out.println(countLow + " Lowercase letters");
        System.out.println(countNum + " Numbers");
    }

}
