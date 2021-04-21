package mugi;

/*
Print out the number of times that the string "hi" appears anywhere in the given string. Only lowercase "hi" should be counted.
 */
public class CountWord {
    public static void main(String[] args) {

        String str = "hi code java please";
        int count = 0;

        for (int i = 0; i < str.length()-1; i++) {
            String eachTwoLetters = str.substring(i, i+2);

            if (eachTwoLetters.equals("hi")){
                count ++;
            }
        }

        System.out.println(count);
    }

}
