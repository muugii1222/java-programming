package day36_methods_with_return;

import java.util.Random;

public class info {
    public static void main(String[] args) {

        System.out.println("Full name: " + fullName());
        System.out.println("Is she married? " + isMarried());
        System.out.println("How old is he? " + getAge());

        System.out.println("Random birth year: " + getRandomYear());
        
        String name = fullName();
        boolean married = isMarried();
        int age = getAge();
        int year = getRandomYear();

        System.out.println("name = " + name);
        System.out.println("married = " + married);
        System.out.println("age = " + age);
        System.out.println("year = " + year);


    }

    public static String fullName (){
        return "Munkhjargal Battsooj";
    }

    public static boolean isMarried (){
        return true;
    }

    public static int getAge (){
        return 34;
    }

    public static int getRandomYear() {
        Random random = new Random();
        int randomYear = random.nextInt(2021);
        return randomYear;
    }


}
