package office_hours.Practice_03_21_2021_ProblemSets;
/*
Ask the user how many people they live with?

if user lives with Less than 2 people: print "Live with less than 2 people" if the user lives with 3 - 6 people: print "Live with 3 - 6 people" if the user lives with more than 6 people: print "Live with "more than 6 people" Ask the user what city they live in?

Ask the user if the live in downtown ("yes or no") if you live downtown, ask them have you thought about moving to the suburbs? ("yes or no") if they have thought about it print "do it its great", if they have not print "You should think about it" Ask the user their favorite animal?

Print "Wow %animal is a great animal" Ask the user how many pets they want?

Print "Interesting, do you want %numberOfPets %favoriteAnimals?"
 */
import java.sql.SQLOutput;
import java.util.Scanner;
public class PersonalInformation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many people do you live with?");
        int people = scan.nextInt();

        if (people <= 2){
            System.out.println("Live with less than 2 people");
        } else if (people >=3 && people <= 6){
            System.out.println("Live with 3 - 6 people");
        } else if (people > 6){
            System.out.println("Live with more than 6 people");
        }

        System.out.println("What city do you live in?");
        String city = scan.next();
        if (city.equalsIgnoreCase("downtown")) {
            System.out.println("Have you thought about moving to the suburbs?");
            boolean move = scan.hasNextBoolean();
            if (move){
                System.out.println("Do it its great");
            } else {
                System.out.println("You should think about it");
            }
        } else {
            System.out.println("Nice!");
        }

        System.out.println("What is favorite animal?");
        String animal = scan.next();

        if (animal.equalsIgnoreCase("dog")){
            System.out.println("Wow " + animal + " is a great animal");
            System.out.println("How many pets do you want?");

            int numOfPet = scan.nextInt();
            if (numOfPet == 1){
                System.out.println("Interesting, do you want " + numOfPet + animal + " ?");
            } else {
                System.out.println("that's big plan");
            }
        }

    }
}