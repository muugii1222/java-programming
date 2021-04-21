package day17_ternary_nested_conditions;

public class MoreTernary {
    public static void main(String[] args) {

        /*
        When to write IF STATEMENT

        int hourlyRate = 50;
        if (hourlyRate > 45) {
            System.out.println("accept");
        } else {
            System.out.println("reject");
         */

//        TERNARY

        int hourlyRate = 50;
        
        String reply = hourlyRate > 45 ? "accept" : "reject";
        System.out.println("reply = " + reply);
        
        String todayClass = "java";
        String teacher = todayClass.equals("Murodil") ? "Saim|Murodil" : "Nadir";
        System.out.println("Today's teacher = " + todayClass);
        
        boolean isEligibleToDrive = false;
        String driving = isEligibleToDrive ? "have DL, and can drive" : "No DL, cannot drive";
        System.out.println("driving = " + driving);
    }
}
