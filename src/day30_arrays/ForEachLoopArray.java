package day30_arrays;

public class ForEachLoopArray {
    public static void main(String[] args) {
//                      0   1   3    4    5    6    7    8    9  10
        int [] data = {32, 532, 12, 5454, 22, 123, 543, 999, 321, 3};

//      FOR EACH LOOP

        for( int eachNum : data){
            System.out.print(eachNum + ", ");
        }

        System.out.println();

//      FOR LOOP

        for (int i = 0; i < data.length; i++){
            System.out.print(data[i] + ", ");
        }

        System.out.println();

//        print last value in array using length - 1

        System.out.println(data[data.length-1]);

//        REVERSE NUMBERS
        for (int i = data.length-1; i >=0; i--) {
            System.out.print(data[i] + ", ");
        }

    }
}
