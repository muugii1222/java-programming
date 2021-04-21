package mugi;

/**
Write a program that will print a box of #'s taking from user the height and width values. (using loop)

Enter height:
4
Enter width:
6
# # # # # #
# # # # # #
# # # # # #
# # # # # #

 */

import java.util.Scanner;

public class GroupWork {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter width:");
        int height = scan.nextInt();
        String symbol = "#";

        System.out.println("Enter height:");
        int width = scan.nextInt();

//        Used nested loop

        for(int i = 1; i <= width; i++){

            for (int j = 1; j <= height; j++){

                System.out.print("#");
            }
            System.out.println();
        }
    }


}






