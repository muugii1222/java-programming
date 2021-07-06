package day58_polymorphism.superman;

public class Superman extends Father implements Worker {

    @Override
    public void work(String job) {
        System.out.println("Superman is working as " + job);
    }

    @Override
    public Double getPaid() {
        System.out.println("Superman is getting paid");
        return 8000.0;
    }
}
