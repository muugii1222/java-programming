package day55_abstraction.exercise_examples;

import day55_abstraction.exercise_examples.Exercise;

public class Swimming extends Exercise {


    @Override
    public void perform() {
        System.out.println("Performing swimming in a pool");
    }

    @Override
    public int getCaloriesCount(int minutes) {
        return minutes*11;
    }
}
