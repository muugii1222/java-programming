package office_hours.Practice_03_15_2021_Homework;

/*
[Street light]

You are at a street line. The color of the street line will determine what you should do.

    Green light - Print "Go"
    Yellow light - Print "Slow down"
    Red light - Print "Stop"

 */
public class StreetLight {
    public static void main(String[] args) {
        String light = "Red Light";

        if (light.equals("Green Light")) {
            System.out.println(light + " - Go");
        } else if (light.equals("Yellow Light")) {
            System.out.println(light + " - Slow down");
        } else if (light.equals("Red Light")) {
            System.out.println(light + " - Stop");
        }
    }
}
