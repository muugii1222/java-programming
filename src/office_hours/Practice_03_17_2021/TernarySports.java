package office_hours.Practice_03_17_2021;
/*
[Sport]

Given a sport you play at the community center you will have to pay some enterance fee.

    Soccer or Tennis fee is: 100
    Otherwise fee is: 50
 */
public class TernarySports {
    public static void main(String[] args) {
        String sport = "Volleyball";

        String fee = sport.equals("Soccer") || sport.equals("Tennis") ?  "$100" : "$50";
        System.out.println(fee);
    }
}
