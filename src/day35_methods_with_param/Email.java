package day35_methods_with_param;

import java.util.Locale;

public class Email {
    public static void main(String[] args) {

        buildEmail("Anir", "gmail");
        buildEmail("Munkhjargal Battsooj", "cybertek");
        buildEmail("Tamir Baterdene", "yahoo");

    }

    public static void buildEmail (String name, String domain){
        System.out.println(name.toLowerCase().replace(" ", "_") + "@" + domain.toLowerCase() + ".com");
    }
}
