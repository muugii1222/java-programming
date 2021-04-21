package day10_shorthand_operators;

public class IncrementDcerementOperators {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("i = " + i);
        i++;
        System.out.println("i = " + i);
        i++;
        i++;
        ++i; //same 
        ++i;
        System.out.println("i = " + i);

//      increase use 4 different types
        int linesOfCode = 15;
        System.out.println("linesOfCode = " + linesOfCode);
        linesOfCode = linesOfCode + 1;
        System.out.println("linesOfCode = " + linesOfCode);
        linesOfCode += 1;
        System.out.println("linesOfCode = " + linesOfCode);
        linesOfCode++;
        System.out.println("linesOfCode = " + linesOfCode);
        ++linesOfCode;
        System.out.println("linesOfCode = " + linesOfCode);

//      decrease use 4 different types
        linesOfCode = linesOfCode - 1;
        linesOfCode -= 1;
        linesOfCode --;
        --linesOfCode;
        System.out.println("linesOfCode = " + linesOfCode);
        
        char letter = 'a';
        System.out.println("letter = " + letter);
        letter++;
        System.out.println("letter = " + letter);
        letter++;
        ++letter;
        System.out.println("letter = " + letter);
        letter--;
        System.out.println("letter = " + letter);
        letter--; letter--;
        System.out.println("letter = " + letter);
        
    }
}
