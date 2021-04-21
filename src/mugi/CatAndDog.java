package mugi;
/*
Print true if the string "cat" and "dog" appear the same number of times in the given string word.

Example:

input: catdog
output: true

input: catcat
output: false

input: cat-cheetah-dog-cat
output: false
 */
public class CatAndDog {
    public static void main(String[] args) {

        String word = "catcat";
        int countOfCats = 0;
        int countOfDogs = 0;

        for (int i = 0; i <= word.length()-3; i++){
            String eachThreeLetters = word.substring(i , i+3);

            if (eachThreeLetters.equals("cat")){
                countOfCats++;
            }
            if (eachThreeLetters.equals("dog")){
                countOfDogs++;
            }

        }
        if (countOfCats == countOfDogs){
            System.out.println("true");
        } else {
            System.out.println("false");
        }



    }
}