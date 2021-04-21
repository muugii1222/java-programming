package office_hours.Practice_04_19_2021;

public class MethodClassAndTest {
    public static void main(String[] args) {

        MethodClass.methodOne();

        System.out.println(MethodClass.methodTwo());
        String s = MethodClass.methodTwo();
        System.out.println(s);

        System.out.println(MethodClass.methodThree("Chicago"));

        System.out.println(MethodClass.login("mugi", "abc123"));

    }
}
