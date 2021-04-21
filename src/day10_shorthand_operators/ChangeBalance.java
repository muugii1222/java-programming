package day10_shorthand_operators;

public class ChangeBalance {
    public static void main(String[] args) {
        double balance = 1230.55;
        System.out.println("balance = " + balance);
        
        double baklava = 22.50;
        System.out.println("baklava = " + baklava);
//        decrease balance by baklava price
        balance = balance - baklava;
        System.out.println(balance);
        
        double kenufe = 44.45;
        System.out.println("kenufa = " + kenufe);
        balance = balance - kenufe;
        System.out.println(balance);

//        second kenufe is 50% off
        kenufe = kenufe / 2 ;
        System.out.println("kenufe = " + kenufe);
        balance = balance - kenufe;
        System.out.println("balance after second kenufe = " + balance);
        
        double plov = 7.99;
        System.out.println("plov = " + plov);
        balance = balance - plov;
        System.out.println("balance after plov = " + balance);
        
        double iceTea = 3.0;
        System.out.println("iceTea = " + iceTea);
        //buy 4 ice teas and decrease balance
        balance = balance - iceTea * 4;
        System.out.println("after ice tea balance = " + balance);

        // return baklava
        System.out.println("returning baklava = " + baklava);
        balance = balance + baklava;
        System.out.println("balance after returning baklava = " + balance);

    }
}
