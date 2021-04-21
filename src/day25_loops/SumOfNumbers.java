package day25_loops;

public class SumOfNumbers {
    public static void main(String[] args) {
        int sum = 0;

        for (int count = 1; count <=100; count++ ){
            System.out.println(count);
            sum += count;
        }
        System.out.println("sum = " + sum);
    }
}
