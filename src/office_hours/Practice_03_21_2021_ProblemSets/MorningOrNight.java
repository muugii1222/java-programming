package office_hours.Practice_03_21_2021_ProblemSets;
/*
Given some time value (int) in 24 hours format. Print if its the morning or night.

0 - 11 : Morning 12- 24 : Night

-> You can assume the value given is always valid (in the 24 hours range), but if you want a challenge use an if to control invalid values
 */
public class MorningOrNight {
    public static void main(String[] args) {
        int time = 45;

//        if (time >= 0 && time <= 11) {
//            System.out.println("Morning");
//        } else if (time >= 12 && time <= 24){
//            System.out.println("Night");
//        } else {
//            System.out.println("Invalid hours);


        String hour = (time >= 0 && time <= 11) ? "Morning" : "Night";
        System.out.println(hour);
    }
}
