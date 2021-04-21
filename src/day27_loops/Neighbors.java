package day27_loops;
/*
String word = "jaaavvaa";

if 2 side by side characters match: signal beep - a
aa -> beep - a
vv -> beep - v
aa -> beep - a

 */
public class Neighbors {
    public static void main(String[] args) {

        String word = "wooden spoon";
//                                print pair letters when it's go to last letter it trying to print last one with                                       next letter, there is no more letter get error, so -1 for print before first letter
        for (int index = 0; index < word.length()-1; index++){


            System.out.print(word.charAt(index));
            System.out.println(word.charAt(index+1)); //print pairs

            if (word.charAt(index) == word.charAt(index+1)) {
                System.out.println("beep - " + word.charAt(index));
            }
        }

    }
}
