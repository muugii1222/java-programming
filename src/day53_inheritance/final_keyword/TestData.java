package day53_inheritance.final_keyword;

public final class TestData {

    /**
     * Test class that has a list of Constants
     * Values of below variables cannot be changed anywhere
     * */

    public static final String ADMIN_USERNAME = "admin";
    public static final String ADMIN_PASSWORD = "password123";
    public static final int MAX_WAIT_TIME = 60;
    public static final boolean STOP_IF_FAIL = true;


}

// ERROR: Cannot inherit from final class

//class Child extends TestData{
//
//}
