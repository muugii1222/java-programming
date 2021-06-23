package day56_abstraction.greeting;

public class Mongolian implements Greeting {

    @Override
    public void hi() {
        System.out.println("сайн уу");
    }

    @Override
    public void bye() {
        System.out.println("баяртай");
    }
}
