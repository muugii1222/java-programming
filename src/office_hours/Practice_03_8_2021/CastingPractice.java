package office_hours.Practice_03_8_2021;

public class CastingPractice {
    public static void main(String[] args) {

//        byte -> short -> int -> long -> float -> double

        /*
        by default whole numbers will be read as int datatype
        by default decimal numbers will be read as double datatype
         */

        byte b = 10;
        short s = b;
        byte b2 = (byte)s;

        double d = 5.3;
        int i = (short)d;
        int i2 = (int)d;
        System.out.println(i);
        System.out.println((double)i);

        float f = 3;
        float f1 = 3.54f;
        float f2 = (float)3.54; //float = (float)double

        float f3 = 5; //float = int -> 5.0
        float f4 = 5.5F; //float = double

        long l = 3674365; //long = int
        long l1 = 672354783798650L;
        System.out.println(l);
        System.out.println((double)l);

        double million = 1_000_000;
        System.out.println(million);



    }
}
