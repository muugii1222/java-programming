package day18_conditions_practice_strings_intro;
/*
Winter: 12, 1, 2;
Spring: 3, 4, 5;
Summer: 6, 7, 8;
Fall: 9, 10, 11;
 */
public class SeasonFinder {
    public static void main(String[] args) {
        int month = 11;

//        IF STATEMENT

        if (month == 12 || month == 1 || month == 2){
            System.out.println("Winter");
        } else if (month == 3 || month == 4 || month == 5) {
            System.out.println("Spring");
        } else if (month == 6 || month == 7 || month == 8) {
            System.out.println("Summer");
        } else if (month == 9 || month == 10 || month == 11) {
            System.out.println("Fall");
        }

//        SWITCH STATEMENT --> can use only value = with something

        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            case 3: case 4: case 5:             // same
                System.out.println("Spring");
                break;
            case 6: case 7: case 8:
                System.out.println("Summer");
                break;
            case 9: case 10: case 11:
                System.out.println("Fall");
                break;
            default:
                System.out.println("Invalid month");
        }

    }
}
