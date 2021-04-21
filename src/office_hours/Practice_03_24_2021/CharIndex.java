package office_hours.Practice_03_24_2021;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Locale;

public class CharIndex {
    public static void main(String[] args) {

        /* index
        position of character

        Index start from 0

        charAt(int) -> gives a char
        indexOf(char) -> gives a int (index)

         */

        String s = "java"; // length is 4, but index start with 0, so thee is no 4 index
//        System.out.println(s.charAt(s.length())); // StringIndexOfOutBoundsException
        System.out.println(s.charAt(s.length()-1)); //gives you last index

        System.out.println(s.charAt(0));
        System.out.println(s.charAt(1));
        System.out.println(s.charAt(2));
        System.out.println(s.charAt(3));

//        print in one line (have to use "" made it to concatenation)
//        if don't use it add chars
        System.out.println(s.charAt(0) + "" + s.charAt(1) + "" + s.charAt(2) + "" + s.charAt(3));

//        change to JAVA, use channing one by one
//    or  can resign String s = "java"  -->  String s = "JAVA"
        String upper = "" + s.toUpperCase().charAt(0) + s.toUpperCase().charAt(2);
        System.out.println(upper);

        System.out.println(s.indexOf('a'));  // 1
        System.out.println(s.indexOf('m')); // -1

        System.out.println(s.contains("j"));
        System.out.println(s.indexOf('j') >= 0 ? "Contains": "Not contains");
        System.out.println(s.indexOf('g') >= 0 ? "Contains": "Not contains");

//        CHANNING
        System.out.println(s.toLowerCase().contains("a"));
        System.out.println(s.toLowerCase().startsWith("a"));

//        boolean.String method
        System.out.println(s.toLowerCase().replace("j", "g").startsWith("a"));
    }
}
