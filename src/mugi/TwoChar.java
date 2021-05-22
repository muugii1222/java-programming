package mugi;

/*
Given a string and an index, return a string length 2 starting at the given index. If the index is too big or too small to define a string length 2, use the first 2 chars. The string length will be at least 2.


twoChar("java", 0) → "ja"
twoChar("java", 2) → "va"
twoChar("java", 3) → "ja"
 */
public class TwoChar {
    public static void main(String[] args) {
        String a = "java";

        System.out.println(a.charAt(0)+""+a.charAt(a.length()-1));

    }


}
