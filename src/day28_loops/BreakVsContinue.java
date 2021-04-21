package day28_loops;

public class BreakVsContinue {
    public static void main(String[] args) {
//        BREAK STATEMENT
        for (int i = 1; i <=5; i++){
            System.out.print(i);
            if(i == 3){
                break; // exit the
            }

        }
        System.out.println();
        for (int n = 1; n <=5; n++){
            if (n == 2 || n == 4){
                continue;  // skip the matching if condition
            }
            System.out.print(n);
        }
    }
}
