package day38_methods;

import static day38_methods.StringUtils.*;

public class StringUtilTest {
    public static void main(String[] args) {
        String userName = "";
        if (StringUtils.isNullOrEmpty(userName)){
            System.out.println("User name cannot be null or empty");
        }

        System.out.println("isPAlindrome(civic) = " + StringUtils.isPalindrome("civic"));
        System.out.println("isPAlindrome(mugi) = " + StringUtils.isPalindrome("mugi"));
        System.out.println("isPAlindrome(anna) = " + isPalindrome("anna"));
        // import static day38_methods.StringUtils.*;  --> can import class


        System.out.println("Reversed word: " + StringUtils.reverse("happy"));

        String word = "java";
        String revWord = StringUtils.reverse(word);
        System.out.println("word = " + word);
        System.out.println("revWord = " + revWord);

    }
}
