package mugi;
/*
A variable inhabitants represents a city and its respective populations. City might have a population of 0 due to a pandemic zombie disease that is wiping away the human lives. After each day, a city will lose half of its population. Write a program to loop the city population and make it lose half of its population until population is zero. Print the each day like below for each day:

Example - inhabitants are 6

Day 0 [6]
Day 1 [3]
Day 2 [1]
---- EXTINCT ----
 */
public class ZombieAttack {
    public static void main(String[] args) {

        int inhabitants = 20;

        for (int day = 0; day <= 30; day++){
            if (inhabitants > 0) {
                System.out.println("Day " + day + " [" + inhabitants + "]");
                inhabitants = inhabitants / 2;

            } else if (inhabitants == 0){
                break;
            }
        }

        System.out.println("---- EXTINCT ----");

    }
}
