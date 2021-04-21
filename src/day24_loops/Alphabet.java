package day24_loops;

public class Alphabet {
    public static void main(String[] args) {
        char letter = 'A';
//        System.out.println("letter = " + letter);
//        letter++;
//        System.out.println("letter = " + letter);

        while (letter <= 'Z') {
            System.out.print(letter + " ");
            letter++;
        }
        System.out.println();

        char letter1 = 'a';
        while (letter1 <= 'z') {
            System.out.print(letter1 + " ");
            letter1++;
        }
        System.out.println();

        while (letter >'A') {
            letter--;
            System.out.print(letter + " ");

        }

        System.out.println();

        while (letter1 > 'a') {
            letter1--;
            System.out.print(letter1 + " ");

        }

    }

}
