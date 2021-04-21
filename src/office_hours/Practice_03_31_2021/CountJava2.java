package office_hours.Practice_03_31_2021;

public class CountJava2 {
    public static void main(String[] args) {

        String str = "java is fun. java class today, not javascript";
        int count = 0;
//                              length()-1 always give last character
        for (int i = 0; i < str.length()-3; i++) {
//            check every 4 characters start to end, cuz java has 4 character.
            String eachFourLetters = str.substring(i ,  i+4);

            if (eachFourLetters.equals("java")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
