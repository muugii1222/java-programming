package day44_custom_classes;

public class MyApp {
    public static void main(String[] args) {
        App app = new App();

        app.name = "Messenger";
        app.version = "8.5.6";

        System.out.println("appName = " + app.name);
        System.out.println("app version = " + app.version);

        app.open();

        app.version = "9.0.0";
        System.out.println("Latest app version = " + app.version);

    }



}
