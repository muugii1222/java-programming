package day31_arrays;

import java.sql.SQLOutput;

public class CharArray {
    public static void main(String[] args) {

        char[] letters = {'j', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'f', 'u', 'n'
        };

        for (char each : letters) {
            System.out.print(each);
        }

//        CONVERT CHAR ARRAY TO STRING:
        String sentence = new String(letters);
        System.out.println("\n" + sentence);

//         CONVERT STRING TO CHAR ARRAY:
        String item = "wooden spoon";
        char[] itemArray = item.toCharArray();
        System.out.println(itemArray.length);
        System.out.println(item.length());


//                              0       1       2       3           4           5
        String[] items = {"banana", "apple", "kiwi", "mango", "papaya", "strawberry"};
        String fruitsStr = "";

        for (String each : items) {
        System.out.print(each + "-");
            fruitsStr += each + "-";
        }
        System.out.println("\n" + fruitsStr);

//      JOIN METHOD

        String [] languages = {"java", "python", "c++", "sql", "ruby", "javascript"};

        System.out.println(String.join(" * ",languages));

    }
}