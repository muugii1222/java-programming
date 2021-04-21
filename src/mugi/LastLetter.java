package mugi;

import java.util.Scanner;

public class LastLetter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE
        if (word.length() % 2 == 1){
            if (word.length() >= 3)
                System.out.println(word);
        }

    }
}
