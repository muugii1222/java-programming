package day35_methods_with_param;

public class Counters {
    public static void main(String[] args) {
        count(100);     //count until 100
        int num2 = 999;      //count until 999
        count(num2);

        System.out.println();
        String word = "wooden spoon";
        count(word.length());   //word length is 12, count until 12

        System.out.println();
        printAge(1987);
        printAge(1955);
        printAge(1963);

        int birthYear = 2001;
        printAge(birthYear);



    }

    public static void count (int num){
        for (int i = 0; i <=num; i++){
            System.out.print(i + " ");
        }
    }

    public static void printAge (int year){
        int age = 2021 - year;
        System.out.println("Birth year: " + year + ". Age: " +  age);
    }
}
