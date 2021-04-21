package day18_conditions_practice_strings_intro;

public class MultiBranchIf {
    public static void main(String[] args) {
        int num =  0;

        if (num > 0){
            System.out.println(num + " is positive");
        } else if (num <0) {
            System.out.println(num + " is negative");
//        } else if (num == 0){                               //it's okay but computer works more
        } else {
            System.out.println(num + " is zero");
        }
    }
}
