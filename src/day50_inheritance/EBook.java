package day50_inheritance;

public class EBook extends Book{
    double size;
    int pages;

    public void readBook(){
        System.out.println("Reading book: ");
        System.out.println("Title: " + title);
        System.out.println("author = " + author);
        System.out.println("price = " + price);
        System.out.println("size = " + size);
        System.out.println("pages = " + pages);
    }

}
