package day27_loops;

public class IndexOf {
    public static void main(String[] args) {

        String word = "github";
        char letter = 'g';     //try to find t
        int index = -1;        //

        for (int i = 0; i < word.length(); i++) {
//            System.out.println(i + "-" + word.charAt(i));
            if (word.charAt(i) == (letter)) {
                index = i; // stored for outside of loop
                System.out.println(letter + " is found at index " + index); //can print outside of loop after if + else if
                break;  // exit for loop
            }
        }

        if (index == -1){
            System.out.println(letter + " is not present");
        }

    }
}
