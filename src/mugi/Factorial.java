package mugi;
/*
In mathematics a factorial of a positive integer n, denoted by n!, is the product of all positive integers less than or equal to n. Calculate factorial and output result to the console.

Example:

input: 5
output: 120

5 * 4 * 3 * 2 * 1
 */
public class Factorial {
    public static void main(String[] args) {

        int n = 5;
//      5! = 5 * 4 * 3 * 2 * 1 ;
        long result = 1L;
//        result = result * 5
//        result = result * 4
//        result = result * 3
//        result = result * 2
//        result = result * 1

        for (int i = n; i >= 1; i--){
            result = result * i;
        }

        System.out.println(result);




    }
}
