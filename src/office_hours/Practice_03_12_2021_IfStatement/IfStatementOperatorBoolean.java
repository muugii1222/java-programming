package office_hours.Practice_03_12_2021_IfStatement;
/*
       Write a program that will accept a boolean value. 
       Print out the opposite of the given boolean

       Ex: true -> false
       false -> true

        */
public class IfStatementOperatorBoolean {
    public static void main(String[] args) {

        boolean input = true;
        if (input == false ){
            System.out.println(input + " --> true");
        } else if (input == true){
            System.out.println(input + " --> false");
        }

    }
}
