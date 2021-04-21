package office_hours.Practice_03_30_2021;
/*
Given a String str and a number n check if the prefix (made of up of the first n characters) appears in the remaining part of the String. Print true or false.

prefix - first letter

ex: input: abXYabc
input: 1

output: true

Assume that the String is not empty and that n is in the range from 1 to str.length().
 */
public class PreFixAgain {
    public static void main(String[] args) {

        String str = "abXYabc";
        int n = 1;   // how many character in prefix

        //breaking word to 2 part
        String prefix = str.substring(0,n);  //part 1: prefix
        String remaining = str.substring(n); //part 2: left part

        System.out.println(remaining.contains(prefix));

    }
}
