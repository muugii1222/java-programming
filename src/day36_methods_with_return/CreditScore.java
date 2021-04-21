package day36_methods_with_return;

public class CreditScore {
    public static void main(String[] args) {
        checkEligible(650);
//        System.out.println(checkEligible(711));    //VOID --> can't print void method
        System.out.println(getCreditScore());
        System.out.println("score = " + getCreditScore()); //give a value
        int score = getCreditScore();
        System.out.println("score = " + score);


    }

    public static void checkEligible (int creditScore){

        if (creditScore >=700){
            System.out.println("You are eligible for leasing this car");
        } else {
            System.out.println("Sorry, you are not eligible for leasing this car");
        }

        }

    public static int getCreditScore() {        //returning value
        return 800;
    }
}
