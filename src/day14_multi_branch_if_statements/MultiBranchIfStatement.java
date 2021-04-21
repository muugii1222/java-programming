package day14_multi_branch_if_statements;
/*
WITHOUT MULTI BRANCH

int day = 1
if (day == 1){
   System.out.println("Monday");
} else {
    System.out.println("Not Monday");
}
if (day == 2){
   System.out.println("Tuesday");
} else {
    System.out.println("Not Tuesday");
}
 */

public class MultiBranchIfStatement {
    public static void main(String[] args) {

//        WITH MULTI BRANCH

        byte day = 20;

        if (day == 1){
            System.out.println("Monday");
        } else if (day == 2){
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else if (day == 7) {
            System.out.println("Sunday");
        }

    }
}
