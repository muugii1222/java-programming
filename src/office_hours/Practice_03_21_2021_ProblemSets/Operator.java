package office_hours.Practice_03_21_2021_ProblemSets;
/*
Analyze each step, What is the result of a, b, and c?

int a = 3, b = 2;

long c = (a-- + b) * 2 / 3 % 2;

---------------------------------------------------------
Analyze each step, What is the result numOne, numTwo, and biggest?

int numOne = 10;

int numTwo = numOne++ * 3 + ++numOne + numOne++ % 2;

int biggest = numOne > numTwo ? numOne : numTwo;
 */
public class Operator {
    public static void main(String[] args) {
        int a = 3, b = 2;
//               (2  +  2) * 2 / 3 % 2 = 1
        long c = (a-- + b) * 2 / 3 % 2;

        System.out.println("a = " + a);     //2
        System.out.println("b = " + b);     //2
        System.out.println("c = " + c);     //1

        int numOne = 10;
//                      11    * 3 +    12    +  13     %  2  =
        int numTwo = numOne++ * 3 + ++numOne + numOne++ % 2;
//                      13   >       ?
        int biggest = numOne > numTwo ? numOne : numTwo;

        System.out.println("numOne = " + numOne);
        System.out.println("numTwo = " + numTwo);
        System.out.println("biggest = " + biggest);

    }
}
