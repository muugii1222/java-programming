package mugi;

/*
We'll say that a "triple" in a string is a char appearing three times in a row. Print out the number of triples in the given string. The triples may overlap.

Example:
input: abcXXXabc
output: 1

 */
public class TripleCount {
    public static void main(String[] args) {

        String str = "xxxabyyyycd";
        int count = 0 ;

        for (int i = 0; i < str.length()-2; i++){
            if (str.charAt(i) == str.charAt(i+1) && str.charAt(i) == str.charAt(i+2)){
                count++;
            }

        }
        System.out.println(count);
    }
}
