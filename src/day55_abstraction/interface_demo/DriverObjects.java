package day55_abstraction.interface_demo;

public class DriverObjects {
    public static void main(String[] args) {

//        WebDriver driver = new WebDriver(); --> ERROR: it cannot creat object of interface

        ChromeDriver chromeDriver = new ChromeDriver();
        FireFoxDriver fireFoxDriver = new FireFoxDriver();

//        WebDriver webDriver = new ChromeDriver(); --> polymorphism

        chromeDriver.get("https://www.google.com");
        chromeDriver.findElement("//p[@class='fish22']");
        System.out.println("Title = " + chromeDriver.getTitle());
    }
}
