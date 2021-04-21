package office_hours.Array_Practice_1;

/*
Max and Min number from Array

•Write a program that can find the maximum number from any given int array
•Write a program that can find the minimum number from any given int array

 */
public class MaxAndMinNumber {
    public static void main(String[] args) {
        int [] nums = {100,57,47,10,18,9,94,95,99,28,25,68,111,59,};
        int max = nums[0];
        int min = nums[0];

//        USING FOR LOOP

        for (int i =1; i < nums.length; i++) {

            if (nums[i] > max){
               max = nums[i];
            }
            if (nums[i] < min){
                min = nums[i];
            }
        }
        System.out.println(max);
        System.out.println(min);

//      USE FOR EACH LOOP

        for (int each : nums){
            if (each < min){
                min = each;
            }
            if (each > max){
                max = each;
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
