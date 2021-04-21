package day38_methods;

public class RecursiveMethod {
    public static void main(String[] args) {
        printName(1);
    }

    public static void printName (int num){
        System.out.print(num + " ");
        num++;
        if (num <= 100){
            printName(num);
        }

    }
}
