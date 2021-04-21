package office_hours.Practice_03_24_2021;

/*
A sandwich is two pieces of bread with something in between. Print the string that is between the first and last appearance of "bread" in the given string, or return string "nothing" if there are not two pieces of bread.
 */
public class Sandwich {
    public static void main(String[] args) {

        String str = "breadjellybread";

        if (str.contains("bread")){

            int firstBread = str.indexOf("bread");
//                         after bread word        check next bread
            if (str.substring(firstBread+5).contains("bread")){

                int secondBread = str.lastIndexOf("bread");
                String result = str.substring(firstBread+5, secondBread);

                if(result.isEmpty()) {
                    System.out.println("nothing");
                } else {
                    System.out.println(result);
                }


            } else {
                System.out.println("nothing");
            }

        } else {
            System.out.println("nothing");
        }
    }
}
