package mugi;
/*
Given a string word, if the first or last chars are 'x' or 'X', print the string without those 'x' or 'X' chars,otherwise print the string unchanged.

Example:

input: xHiX
output: Hi

input: apple
output: apple

 */
public class Java {
    public static void main(String[] args) {
//                     0123
        String word = "xjava";

        if (word.startsWith("x") && word.startsWith("X") && word.endsWith("x") && word.endsWith("X")) {

            System.out.println(word.substring(1, word.length()-1));

        } else if (word.startsWith("x") || word.startsWith("X")){

            System.out.println(word.substring(1, word.length()));

        } else if (word.endsWith("x") || word.endsWith("X")) {

            System.out.println(word.substring(0, word.length()-1));

        } else {

            System.out.println(word);
        }




    }
}
