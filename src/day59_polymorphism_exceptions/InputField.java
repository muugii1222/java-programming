package day59_polymorphism_exceptions;

public class InputField implements WebElement{

    public static final String TAG_NAME = "input";

    public void getValue(){
        System.out.println("getValue");
    }

    @Override
    public void sendKeys(String text) {
        System.out.println("Typing into input field " + text);
    }

    @Override
    public void click() {
        System.out.println("CLicking ");
    }

    @Override
    public String getText() {
        System.out.println("Getting text input to the filed");
        return null;
    }


}
