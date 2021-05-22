package mugi;

import java.util.Scanner;

public class OOP {
    static class Main {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            LameCalculator1 lc = new LameCalculator1();
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(lc.plus(a, b));
            System.out.println(lc.minus(a, b));
            System.out.println(lc.multiply(a, b));
            System.out.println(lc.divide(a, b));

        }
    }

    public static class LameCalculator1{
        int a;
        int b;

        public double plus (int a, int b){
            return a + b;
        }

        public double minus (int a, int b){
            return a - b;
        }

        public double multiply (int a, int b){
            return a * b;
        }

        public double divide (int a, int b){
            return a / b;
        }
    }
}
