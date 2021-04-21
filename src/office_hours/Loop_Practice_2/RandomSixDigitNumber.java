package office_hours.Loop_Practice_2;

/*
CHALLENGE
Generate a random number that is six digits long. Each digit in this number should be unique, meaning the number 6 digit number should have 6 different character numbers that make it up. Print the number.
HINTS: Loops, Strings, Random
 */

import java.util.Random;

public interface RandomSixDigitNumber {
    public static void main(String[] args) {

        Random random = new Random();

        String randomNumber = "";

        while (randomNumber.length() != 6) {
            
            int eachRandom = random.nextInt(10); // give you random number 0-10
            
            if(!randomNumber.contains("" + eachRandom)) {
                randomNumber += eachRandom;
            }
        }

        System.out.println("randomNumber = " + randomNumber);
    }
}
