package day55_abstraction.exercise_examples;

import day55_abstraction.exercise_examples.Exercise;

public class Running extends Exercise {

    @Override
    public void perform() {
        System.out.println("Performing running exercise");
    }

    @Override
    public int getCaloriesCount(int minutes) { //assuming num of calories
        return minutes*13;
    }
}
