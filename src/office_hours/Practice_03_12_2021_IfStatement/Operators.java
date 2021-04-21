package office_hours.Practice_03_12_2021_IfStatement;

/*
[Operators]

Analyze the following without intellij. Calculate the output step by step 

    int a = 5; // 5
    int b = a++ + a-- + a * 2 + a + ++a;
            5  +  6  +  5 * 2 + 5 +  6
            b = 32


What is the value of a and b?
 */
public class Operators {
    public static void main(String[] args) {
        int a = 5; // 5
        int b = a++ + a-- + a * 2 + a + ++a;
        System.out.println("b = " + b);

        /*
        Analyze the following without intellij. Calculate the output step by step

        int a = 200;
        int b = -a++ + - --a * a-- % 2 + a;
                -200 + -200  * 200 % 2 + 199;
                -200 + -40000 % 2 + 199;
                -200 + 0 + 199;
            b = -1

        What is the value of a and b?

         */

        int a1 = 200;
        int b1 = -a1++ + - --a1 * a1-- % 2 + a1;
        System.out.println("b1 = " + b1);
        
        /*
        Analyze the following without intellij. Calculate the output step by step 

        int x = 300;  
        int y = 400;   
        int z = x + y - x * y + x / y;
        int z = 300 + 400 - 300 * 400 + 300 / 400 = - 119_300.75 // int skip 0.75
        What is the value of x, y, and z?
         */

        int x = 300;
        int y = 400;
        int z = x + y - x * y + x / y;
        System.out.println("z = " + z);
    }
}

