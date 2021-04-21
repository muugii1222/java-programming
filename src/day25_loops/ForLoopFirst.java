package day25_loops;

public class ForLoopFirst {
    public static void main(String[] args) {
        /** below is infinite loop with for loop like: while(true){  }
            for (; ;) {
            System.out.println("Java is fun");
        }
         */

        for (int i = 0; i <=5 ; i++){
            System.out.println("Hello World");
        }





        for (int stars = 1; stars <=15 ; stars++){
            System.out.print("* ");
        }
        System.out.println();




        String myStars = "";
        myStars += "* ";
        myStars += "* ";
        myStars += "* ";
        myStars += "* ";
        myStars += "* ";     // Instead of repeating couple times can use < FOR LOOP >
        System.out.println("my stars = " + myStars);

        myStars = "";
        for (int i = 1; i <=5 ; i++) {
            myStars += "* ";

        }
        System.out.println("my stars = " + myStars);
    }
}
