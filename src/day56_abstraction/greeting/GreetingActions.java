package day56_abstraction.greeting;

public class GreetingActions {
    public static void main(String[] args) {
        Mongolian mgl = new Mongolian();
        mgl.hi();
        mgl.bye();

        Greeting gr = new Mongolian();
        gr.hi();
        gr.bye();

        Korean kr = new Korean();
        kr.hi();
        kr.bye();

        Greeting gr1 = new Korean();
        gr1.hi();
        gr1.bye();


    }
}
