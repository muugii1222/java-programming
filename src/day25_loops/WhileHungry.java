package day25_loops;

public class WhileHungry {
    public static void main(String[] args) {
        boolean isHungry = true;
        int banana = 0;
        int controlToFull = 3;

        while (isHungry){
            banana++;
            System.out.println("banana = " + banana);
//isHungry = banana == controlToFull? false : true;
            if (banana == controlToFull){
                isHungry = false;
            }

        }
        System.out.println("Not hungry anymore");
    }
}
