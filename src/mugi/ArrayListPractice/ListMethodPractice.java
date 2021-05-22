package mugi.ArrayListPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListMethodPractice {
    public static void main(String[] args) {

        System.out.println(getDays());
        System.out.println(getDays().get(3));
        System.out.println(getDays().size());

        List<String> list = getDays();
        list.add(0, "Java day");
        System.out.println(list);

        list.removeIf(day -> day.length() == 6);
        System.out.println("day names after removeIf = " + list);

        list.removeIf(day -> day.contains(" "));
        System.out.println(list);

        list.removeIf(day -> day.contains("day"));
        System.out.println(list);

        


    }

    /**
     * getDays
     * No params
     * return List<String> with "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
     */

    public static List<String> getDays (){
        List<String> days = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));
        return days;
    }
}
