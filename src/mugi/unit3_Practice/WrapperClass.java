package mugi.unit3_Practice;

public class WrapperClass {
    public static void main(String[] args) {

        Integer n = new Integer(300);
        System.out.println(n.equals(200));
        System.out.println(n.intValue());
        System.out.println(n.compareTo(100));

        Integer a = 200;
        System.out.println(a.intValue());
        System.out.println(a);

        //auto boxing
        int s = 50;
        Integer s2 = s;
        System.out.println(s2.intValue());

        //un-boxing
        Integer d = 1234;
        int d1 = d;
        System.out.println(d1);

        //converting String in to primitive
        String total = "234";
        int count = Integer.parseInt(total);
        System.out.println(count);

        String num = String.valueOf(2);
        System.out.println(num);



    }
}
