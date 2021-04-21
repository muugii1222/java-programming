package day27_loops;

public class ReadStringPortion {
    public static void main(String[] args) {
        String list = "cat,car,black_cat,red_car";

//                               print 3 letters when it's go to last letter it trying to print last one with next                                   letter, there is no more letter then get error, so -2 for print before 2 letters
        for (int i = 0; i < list.length()-2; i++){
            System.out.println(list.substring(i, i+3));
            if (list.substring(i, i+3).equals("cat") || list.substring(i, i+3).equals("car")){
                System.out.println("cat or car found");
            }
        }



// using substring print first 3 letters
//        int i = 0;
//        System.out.println(list.substring(i, i+3));
//        i++;
//        System.out.println(list.substring(1, 4));
//        System.out.println(list.substring(2, 5));
//        System.out.println(list.substring(3, 6));
//        System.out.println(list.substring(4, 7));


    }
}
