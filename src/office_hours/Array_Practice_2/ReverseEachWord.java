package office_hours.Array_Practice_2;

import day38_methods.StringUtils;

import java.util.Arrays;

/*
Reverse Each word

Given a String, reverse each individual word and print the result

Hint: Use a nested loop, split

Input: It started to snow in Chicago

Output: tI detrats ot wons ni ogacihC
 */
public class ReverseEachWord {
    public static void main(String[] args) {
        System.out.println(reverseEachWord("It started to snow in Chicago"));
    }

    public static String reverseEachWord(String str) {

        String reverse = "";

        for(String each : str.split(" ")){

            reverse += StringUtils.reverse(each) + " ";

        }

        return reverse.trim();

    }

}