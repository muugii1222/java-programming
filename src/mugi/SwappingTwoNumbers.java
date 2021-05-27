package mugi;

public class SwappingTwoNumbers {
    public static void main(String[] args) {

        //Question 7
        //To explain Algorithm of swapping 2 numbers in coding. (Explain both ways) (3min)

        //1. Swapping two numbers using third variable

        int a = 10;
        int b = 20;
        int c = 0;

        c = a; // 10
        a = b; // 20
        b = c; // 10

        System.out.println("after swapping numbers " + a);
        System.out.println("after swapping numbers " + b);

        //2. Swapping two numbers using third variable
        int A = 30;
        int B = 40;
        
        A = A + B; //70
        B = A - B; //30
        A = A - B; //40

        System.out.println("after swapping numbers " + A);
        System.out.println("after swapping numbers " + B);



    }
}
