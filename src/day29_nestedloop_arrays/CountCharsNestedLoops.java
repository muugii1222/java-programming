package day29_nestedloop_arrays;

public class CountCharsNestedLoops {
    public static void main(String[] args) {
        String word = "java";


        for (int outer = 0; outer < word.length(); outer++){
            char outerLetter = word.charAt(outer);
            int count = 0;

            for (int inner = 0; inner < word.length(); inner++){
                char innerLetter = word.charAt(inner);

                if (outerLetter == innerLetter){
                    count++;
                }
            }
            System.out.println(outerLetter + "=" + count);
        }
    }
}
