package day04_variables_intro;

public class VariableNamingRules {
    static public void main(String[]args){
//        System.out.println("BREAK TILL 4:10pm EST");
//        int static = 22; -> error, static is reserved by java
        int _static2 = 22;
        int _static = 22;
        int $tatic = 22;

        int salary$ = 55;
//      int 1stMonthSalary = 3000 -> error, cannot start with number
        int $ = 10;
        int _ = 3;
        System.out.println($);
        System.out.println(_);
//        Above variables work fine. But not recommended.
//        We should use meaningful names.
//        number-of-friends = 400; -> error
        int numberOfFriends = 400;
        int number_of_friends = 400;
    }
}
