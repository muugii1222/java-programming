package day18_conditions_practice_strings_intro;

public class FizzBuzz {
    public static void main(String[] args) {

        int num = 64;

// if (num % 15 == 0) can use this way --> if number divisible by 15, it's divisible by 3 & 5 same time

        if (num % 3 == 0 && num % 5 == 0){
            System.out.println("FizzBuzz");
        } else if (num % 3 == 0){
            System.out.println("Fizz");
        } else if (num % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println("Else");
        }
    }
}
