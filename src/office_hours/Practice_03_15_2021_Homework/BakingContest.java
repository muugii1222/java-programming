package office_hours.Practice_03_15_2021_Homework;

/*
[Baking contest]

You are in a baking contest. Your cookies will be rated by 3 judges.
The 3 scores from the judges will be averaged and compared with the 2 other people in the contest.

Use variables: judge score 1, judge score 2, judge score 3, other person score 1, other persons score 2

If your score is more than both of the other people then print "First place!"
If your score is more then one other person then print "Second place"
If your score is less than both of the other people then print "Third place"
 */
public class BakingContest {
    public static void main(String[] args) {
       double judgeScore1 = 8;
       double judgeScore2 = 8;
       double judgeScore3 = 6;
       double myAverageScore = (judgeScore1 + judgeScore2 + judgeScore3)/3;
       double otherPersonScore1 = 7;
       double otherPersonScore2 = 8;

       if(myAverageScore > otherPersonScore1 && myAverageScore > otherPersonScore2) {
           System.out.println("Your score is " + myAverageScore + " First place!");
       } else if (myAverageScore > otherPersonScore1 & myAverageScore < otherPersonScore2) {
           System.out.println("Your score is " + myAverageScore + " Second place!");
       } else if (myAverageScore < otherPersonScore1 & myAverageScore > otherPersonScore2) {
               System.out.println("Your score is " + myAverageScore + " Second place!");
       } else if (myAverageScore < otherPersonScore1 & myAverageScore < otherPersonScore2) {
           System.out.println("Your score is " + myAverageScore + " Third place!");
       }
    }
}
