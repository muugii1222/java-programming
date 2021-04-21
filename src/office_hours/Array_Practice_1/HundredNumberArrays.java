package office_hours.Array_Practice_1;

/*
100 number array
1. Create an int array called numbers that has length of 100
2. Assign 1-100 to each index of the array. Then use a for each loop to print out all the elements of the array
 */
public class HundredNumberArrays {
    public static void main(String[] args) {

        int [] nums = new int [100];

        for (int i = 1; i <= nums.length; i++){
            System.out.print(i + ", ");
        }

    }
}
