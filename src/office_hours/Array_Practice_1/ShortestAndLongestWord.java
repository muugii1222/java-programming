package office_hours.Array_Practice_1;

/*
Shortest and Longest words from String array

•Write a program that can return the shortest string element from a String array
•Write a program that can return the longest string element from a String array

 */
public class ShortestAndLongestWord {
    public static void main(String[] args) {

        String [] str = {"Mongolia", "Brazil", "China", "Cuba", "Sweden", "France", "Vietnam", "Albania", "Portugal", "Philippines", "Armenia", "Colombia", "Honduras", "Indonesia", "United States", "Russia"};

        String longest = "";
        String shortest = str [0];

        for (String each : str) {
            if (each.length() > longest.length()) {
                longest = each;
            }
        }
        System.out.println(longest);

        for (String each : str) {
            if (each.length() < shortest.length()) {
                shortest = each;
            }
        }
        System.out.println(shortest);

        }

    }

