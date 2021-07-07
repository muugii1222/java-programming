package day60_exceptions;

public class ThrowingException {
    public static void main(String[] args) {
        System.out.println("Create exception");
//        RuntimeException e = new RuntimeException();
//        throw e;

//        throw new RuntimeException();

        String username = "";
        if (username.isEmpty()){
            throw new RuntimeException("Username cannot be empty");
        }
    }
}
