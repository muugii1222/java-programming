package day55_abstraction.exercise_examples;

public abstract class Exercise {
    public void start(){ //non-abstract method
        System.out.println("Warming up and starting the exercise");
    }

    public abstract void perform(); //abstract method without body, just signature

    public abstract int getCaloriesCount(int minutes); //another abstract method that concrete sub classes will override


}

