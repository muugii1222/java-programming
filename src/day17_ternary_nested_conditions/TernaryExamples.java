package day17_ternary_nested_conditions;

public class TernaryExamples {
    public static void main(String[] args) {
        
//        dataType variableName = (boolean expression) ? trueValue : falseValue;
        
        int score = 80;

        String result = (score > 60) ? "Pass" : "Fail";
        System.out.println("result = " + result);

        String quality = "bad";
        int rating = (quality.equals("good")) ? 100 : 0;
        System.out.println("rating = " + rating);
        System.out.println(quality.equals("good") ? 100 : 0);   // same

        char grade = (score > 90) ? 'A' : 'B';
        System.out.println("grade = " + grade);

        String evenOdd = (score % 2 == 0) ? "even" : "odd";
        System.out.println("evenOdd = " + evenOdd);


    }
}
