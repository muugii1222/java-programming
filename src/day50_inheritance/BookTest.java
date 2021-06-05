package day50_inheritance;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book();
        book.title = "Intro to Java";
        book.author = "Savitch";
        book.type = "programming";
        book.price = 85.0;

        System.out.println("-----Parent class------");
        System.out.println(book.title);
        System.out.println(book.author);
        System.out.println(book.type);
        System.out.println(book.price);

        System.out.println("\n -----child class1------");
        AudioBook audioBook = new AudioBook();
        audioBook.author = "Unmesh";
        audioBook.length = 60;
        audioBook.price = 44.99;
        audioBook.title = "Selenium CookBook";
        audioBook.type = "Automation";
        audioBook.length = 35;
        audioBook.narrator = "Irina";
        audioBook.listen();

        System.out.println("\n -----child class2------");
        EBook eBook = new EBook();
        eBook.author = "Savitch";
        eBook.price = 85;
        eBook.title = "Java data structures";
        eBook.type = "programming";
        eBook.size = 2;
        eBook.pages = 1000;
        eBook.readBook();
    }


}
