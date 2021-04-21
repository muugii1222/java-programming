package day19_class_vs_object_strings;

public class StringStartsEndsWith {
    public static void main(String[] args) {
        String word = "Wooden spoon";

        System.out.println(word.startsWith("W"));       //true
        System.out.println(word.startsWith("Wood"));    //true
        System.out.println(word.startsWith("woo"));     //false -> cuz case sensitive
        System.out.println(word.startsWith("spoon"));   //false

        System.out.println(word.endsWith("n"));         //true
        System.out.println(word.endsWith("poon"));      //true
        System.out.println(word.endsWith("den"));       //false
        System.out.println(word.endsWith("N"));         //false -> cuz case sensitive

        String name = "Mrs. Munkhjargal";

        if (name.startsWith("Mr.")) {
            System.out.println("Man");
        } else if (name.startsWith("Dr.")) {
            System.out.println("Doctor");
        } else if (name.startsWith("Mrs.")) {
            System.out.println("Married woman");
        } else if (name.startsWith("Ms.")) {
            System.out.println("Single woman");
        } else if (name.startsWith("Sr.")) {
            System.out.println("Senior");
        } else {
            System.out.println("Normal name");
        }


        String url = "https://chicagorentals.securecafe.com";

        if (url.endsWith(".com")){
            System.out.println("Commercial website");
        } else if (url.endsWith(".ru")){
            System.out.println("Russian website");
        } else if (url.endsWith(".gov")) {
            System.out.println("Goverment website");
        } else if (url.endsWith(".edu")) {
            System.out.println("Education website");
        } else if (url.endsWith(".org")) {
            System.out.println("Organization website");
        }
    }
}
