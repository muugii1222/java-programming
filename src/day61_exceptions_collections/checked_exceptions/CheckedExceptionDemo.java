package day61_exceptions_collections.checked_exceptions;

public class CheckedExceptionDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("About to sleep for 5 seconds");

        /** handle exception with try/catch*/
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        /** declare using throws keyword */
        Thread.sleep(1000);

    }
}
