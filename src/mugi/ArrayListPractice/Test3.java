package mugi.ArrayListPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {

        ArrayList<Integer> num1 = new ArrayList<>(Arrays.asList(4, 1, 8, -42, 2, 10));
        ArrayList<Integer> num2 = new ArrayList<>();

        for (int each : num1) {
            switch (each) {
                case 1:
                    num2.add(1);
                case 5:
                    num2.add(50);
                    break;
                case 4:
                    break;
                case 8:
                    num2.remove(0);
                    break;
                case 10:
                case -42:
                    num2.add(1, 0);
                    break;
                case 55:
                    num2.add(105);
                    break;
                case 2:
                    num2.add(20000);
                    break;
                default:
                    num2.add(null);
            }

        }
        System.out.println(num2);
    }
}
