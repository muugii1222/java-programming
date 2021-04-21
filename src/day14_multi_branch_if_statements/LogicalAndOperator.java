package day14_multi_branch_if_statements;

public class LogicalAndOperator {
    public static void main(String[] args) {
        System.out.println(true && true);      //true
        System.out.println(true && false);     //false
        System.out.println(false && true);     //false
        System.out.println(false && false);    //false

        System.out.println(10 > 5 && 1 == 1 );  //true
        System.out.println(10 > 5 && 1 == 5 );  //false
        System.out.println(10 > 68 && 1 == 1 );  //false
        System.out.println(100 > 500 && 1 > 5 );  //false
        
        int apples = 10, oranges = 5;
        boolean check = apples > 5 && oranges >3;
        System.out.println("check = " + check);

        if (apples > 5 && oranges >3) {
            System.out.println("I have enough fruits");
        } else {
            System.out.println("I need get some more");
        }
        
        
        
    }
}
