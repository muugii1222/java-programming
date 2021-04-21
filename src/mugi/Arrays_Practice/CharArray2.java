package mugi.Arrays_Practice;

public class CharArray2 {
    public static void main(String[] args) {
        char [] letter = {'j', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'f', 'u', 'n'};

        for (char each : letter){
            System.out.print(each);
        }

//        CONVERT CHAR ARRAY TO STRING
        String sentence = new String(letter);
        System.out.println("\nsentence = " + sentence);

//        CONVERT STRING TO CHAR ARRAY
        String item = "wooden spoon";
        char [] itemArray = item.toCharArray();
        System.out.println("itemArray length: " + itemArray.length);
        System.out.println("item length: " + item.length());
        System.out.println(itemArray);

        String [] fruits = {"banana", "apple", "kiwi", "mango", "papaya", "strawberry"};

        String fruitStr = "";
        for (String each : fruits){
            fruitStr += each + "-";

        }

        System.out.println(fruitStr);

        String [] languages = {"java", "python", "c++", "sql", "ruby", "javascript"};

        System.out.println(String.join("*", languages));
        String joinedLanguages = String.join(" ", languages);
        System.out.println(joinedLanguages);
    }
}
