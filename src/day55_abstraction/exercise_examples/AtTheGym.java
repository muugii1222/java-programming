package day55_abstraction.exercise_examples;

public class AtTheGym {
    public static void main(String[] args) {
//        Exercise exercise = new Exercise(); --> can not create object of super class, it is abstract

        /*
        We can have one variable of type abstract class and object can be any sub class.
        It is called POLYMORPHISM
        */
        Exercise exercise = new Running();
        Exercise exercise1 = new Swimming();
        Exercise exercise2 = new FreeWeight();

        Running running = new Running();
        Swimming swimming = new Swimming();
        FreeWeight freeWeight = new FreeWeight();

        exercise.start();
        exercise.perform();
        System.out.println("Running 30 min - calories = " + exercise.getCaloriesCount(30));

        running.start();
        running.perform();
        System.out.println("Running 30 min - calories = " + running.getCaloriesCount(30));

        swimming.start();
        swimming.perform();
        System.out.println("Swimming 30 min - calories = " + swimming.getCaloriesCount(30));

        freeWeight.start();
        freeWeight.perform();
        System.out.println("FreeWeight 30 min - calories = " + freeWeight.getCaloriesCount(30));
    }
}
