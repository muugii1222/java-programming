package mugi;
/*
Imagine you have a party and need to form the list of the guests. (Assume you have at least one guest)

Ask for the first guest name.

Then ask does user want to enter one more guests.

If yes - take the next guest input

If not - finish the program and print list of the guests.

Example:

Please enter guest name:
Nick
Do you want to enter new guest name:
yes
Please enter guest name:
Linda
Do you want to enter new guest name:
no
Guest's list: Nick, Linda
 */

import  java.util.Scanner;

public class LoopGrocery {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

            String guestName;


        for (int i = 1; i <= 10; i++) {

            System.out.println("Please enter guest name:");
            guestName = scan.nextLine();

            System.out.println("Do you want to enter new guest name:");
            String yesOrNo = scan.next();

            if (yesOrNo.equals("yes")) {
            guestName = guestName + 1;

            }



        }


    }



}