package office_hours.Practice_03_22_2021;
/*
Declare a variable name. You will check if it is a cool name.
    - If the name begins with an ‘a’ or a ‘z’ print “Your name is cool”
    - If the name ends with 'm' print "Almost cool"
    - Otherwise print “Sorry not a cool name”
 */
public class CoolName {
    public static void main(String[] args) {
        String name = "Munkhjargal";

        if (name.contains("a") || name.contains("z")) {
            System.out.println("Your name is cool");
        } else if (name.endsWith("m")) {
            System.out.println("Almost cool");
        } else {
            System.out.println("Sorry not a cool name");
        }
    }
}