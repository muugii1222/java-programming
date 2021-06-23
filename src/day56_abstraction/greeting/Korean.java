package day56_abstraction.greeting;

public class Korean implements Greeting{

    @Override
    public void hi() {
        System.out.println("안녕하세요");
    }

    @Override
    public void bye() {
        System.out.println("안녕");
    }
}
