package day34_void_method;

public class EtsySearchTest {
    public static void main(String[] args) {
        System.out.println("--Starting ETSY Search Smoke Test--");
        openBrowser();
        navigateToEtsyUrl();
        searchForWoodenSpoon();
        verifyResultsAreDisplayed();
        System.out.println("--Etsy Search Smoke Test completed - Pass -");

    }

    public static void openBrowser (){
        System.out.println("Launching Chrome browser");
    }

    public static void navigateToEtsyUrl (){
        System.out.println("Navigating to https://www.etsy.com/");
    }

    public static void searchForWoodenSpoon (){
        System.out.println("Pass: Verify Etsy homepage is displayed");
        System.out.println("Type 'Wooden spoon' in search field and click search");
    }

    public static void verifyResultsAreDisplayed (){
        System.out.println("Pass: Search results are successfully displayed");
    }

}

