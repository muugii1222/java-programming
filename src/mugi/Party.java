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
import java.util.Scanner;

public class Party {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String guestName = "";
        String add = "";
        String list = "";
        int count = 0;

        do {
            System.out.println("Please enter guest name:");
            guestName = input.next();
            list += guestName;

            System.out.println("Do you want to enter new guest name:");
            add = input.next();

            if (add.equals("yes")) {
                list += ", ";

            } else if (add.equals("no")) {
                break;
            }
            count++;

        } while (count >= 1) ;

        System.out.println("Guest's list: " + list);

    }
}
