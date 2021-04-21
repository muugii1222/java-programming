package office_hours.Loop_Practice_3;

/*
[IQ]
Prime in range Given a number. Print out all the prime numbers from 2 to that number A prime number is a number that is only divisible by 1 and itself.

Ex:
Input:50
Output:2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47
 */
public class IQ_PrimeNumber {
    public static void main(String[] args) {
        int num = 50;


        for (int j = 2; j <= num; j++) {
            boolean isPrime = true;
            //                  checking half numbers
            for (int i = 2; i <= j/2; i++) {
                if (j % i == 0) {                 //check negative case first
                    isPrime = false;
                    break;
                }
            }

            if (isPrime){
                System.out.print(j + ", ");
            }
        }

    }
}