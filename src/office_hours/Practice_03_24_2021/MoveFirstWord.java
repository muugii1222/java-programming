package office_hours.Practice_03_24_2021;
/*
Given a sentence. Display the sentence with the first word moved to the end of the sentence. Ex:

input: Java is a fun language output: is a fun language Java

Hint: Use indexOf and substring
 */
public class MoveFirstWord {
    public static void main(String[] args) {

        String str = "Java is a fun language";
        str = str.trim(); //if has space before java can remove first
        int space = str.indexOf(" ");
        String firstWord = str.substring(0, space);
//                                            +1 removed space
        System.out.println(str.substring(space +1 ) + " " + firstWord);


    }
}
