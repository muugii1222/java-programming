package mugi;

/*
Given a string, print out true if the number of appearances of "java" anywhere in the string is equal to the number of appearances of "python" anywhere in the string (case sensitive).

Example:

input: We study java not python

output: true
 */
public class JavaPythonCount {
    public static void main(String[] args) {

        String sentence = "What's the difference between java, javascript and python";
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < sentence.length()-5; i++){
            String eachFourLetters = sentence.substring(i, i + 4);
            String eachSixLetters = sentence.substring(i, i + 6);

            if (eachFourLetters.equals("java")){
                count1++;
            }

            if (eachSixLetters.equals("python")){
                count2++;
            }


        }
        if (count1 == count2){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
