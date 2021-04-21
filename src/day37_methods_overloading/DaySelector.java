package day37_methods_overloading;

public class DaySelector {
    public static void main(String[] args) {
        System.out.println(getDayName(6));

        for (int i = 1; i <= 8; i++) {
            System.out.println(getDayName(i));
        }

        String day = getDayName(9);
        System.out.println("Today is " + day);
        if (day == null) {
            System.out.println("someDay is null for invalid day");
        }

        System.out.println(getDayNameV2(2));

    }

//    HAS MULTIPLE RETURN STATEMENT
    public static String getDayName(int day) {
        switch (day) {
            case 1:
                return "Monday";
//            break; --> unreachable code,
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
//            default: return "Invalid day";
            default:
                System.out.println("Invalid day - " + day);
                return null;

        }
    }

//    WITHOUT MULTIPLE RETURN STATEMENT
    public static String getDayNameV2(int day) {
        String dayName;
        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                System.out.println("Invalid day - " + day);
                dayName = null;

        }
        return dayName;
    }
}

