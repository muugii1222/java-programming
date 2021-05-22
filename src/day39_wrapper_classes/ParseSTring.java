package day39_wrapper_classes;

public class ParseString {
    public static void main(String[] args) {

        String total = "345";

        int num = Integer.parseInt(total);
        int num1 = Integer.parseInt("345");

        double d1 = Double.parseDouble(total);
        double d2 = Double.parseDouble("23.4");

        String strPrice = "123.5";
        double price = Double.parseDouble(strPrice);
        if(price > 100) {
            System.out.println("expensive");
        }

        
        //split by space, parse index 2 to int
        String sentence = "We wrote 500 lines of code";
        String [] words = sentence.split(" ");
        int linesOfCode = Integer.parseInt(words[2]);
        System.out.println(linesOfCode);

    }
}
