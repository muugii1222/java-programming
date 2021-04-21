package day16_switch_ternary;

public class Elevator {
    public static void main(String[] args) {
        byte floorNum = 3;

        if (floorNum == 1) {
            System.out.println("Floor 1 selected. Companies: Lobby, Verizen, Starbucks");
        } else if (floorNum == 2) {
            System.out.println("Floor 2 selected. Companies: Cybertek, NASA, Intelsat");
        } else if (floorNum == 3) {
        System.out.println("Floor 3 selected. Companies: Lyft, BofA, Steak house");
        } else {
            System.out.println("Invalid floor - " + floorNum);
        }

        System.out.println("==============SWITCH STATEMENT VERSION=============");

        floorNum = 1;
        switch(floorNum) {
            case 1:
                System.out.println("Floor 1 selected. Companies: Lobby, Verizen, Starbucks");
                break;
            case 2:
                System.out.println("Floor 2 selected. Companies: Cybertek, NASA, Intelsat");
                break;
            case 3:
                System.out.println("Floor 3 selected. Companies: Lyft, BofA, Steak house");
                break; //exit the switch statement
            default :
                System.out.println("Invalid floor - " + floorNum);

        }
    }
}
