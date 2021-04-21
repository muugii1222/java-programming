package office_hours.Array_Practice_2;

/*
Gradebook ( Similar to MaxMinPrice from class)

Declare three arrays:

1. String array which will hold names for the students (give values)

2. Int array which has the score of the student got in the quiz (give values)

3. Char array which will have some letter grade based on the score (empty)

4. Output the gradebook at the end with all the information

Grade scale: Above 85: A Above 75: B Above 65: C Other: D
 */

public class GradeBook {
    public static void main(String[] args) {
        String[] name = {"Tamir", "Anir", "Mugi", "Bagi"};
        int [] score = {80, 95, 72, 60};
        char [] grade = new char[name.length];

        for (int i = 0; i < score.length; i++){
            int eachScore = score[i];

            if (eachScore >= 85){
               grade[i] = 'A';
            } else if (eachScore >= 75){
                grade[i] = 'B';
            } else if (eachScore >= 65){
                grade[i] = 'C';
            } else {
                grade[i] = 'D';
            }
        }

        System.out.println("GRADEBOOK");

        for (int i = 0; i < name.length; i++){
            System.out.println(name[i] + " | " + score[i] + " | " + grade[i]);
        }


    }
}