package day42_arraylist;

import java.util.*;

public class CollectionsUtil {
    public static void main(String[] args) {

        ArrayList<Character> letters = new ArrayList<>();
        letters.addAll(Arrays.asList('j', 'a', 'v', 'a', 'i', 's', 'f', 'u', 'n'));
        System.out.println("size = " + letters.size());
        System.out.println(letters);

        Collections.reverse(letters);
        System.out.println("reversed = " + letters);

        System.out.println("How many a : " + Collections.frequency(letters, 'a'));
        System.out.println("count f = " + Collections.frequency(letters, 'f'));

        int vCount = Collections.frequency(letters, 'v');
        System.out.println("How many v : " + vCount);

        System.out.println("Max char = " + Collections.max(letters));
        System.out.println("Min char = " + Collections.min(letters));

        Collections.reverse(letters);
        Collections.replaceAll(letters, 'a', 'u');
        System.out.println("after replace all = " + letters);

        Collections.sort(letters);
        System.out.println("After sort = " + letters);

        List<Integer> nums = Arrays.asList(23, 1, 43, 5, 234, 7, -9, 1, 0, 5, 5, 5, 5);

        System.out.println("nums = " + nums);
        Collections.reverse(nums);
        System.out.println("nums after reverse = " + nums);

        int max = Collections.max(nums);
        int min = Collections.min(nums);
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        
        int countOfFives = Collections.frequency(nums, 5);
        System.out.println("countOfFives = " + countOfFives);

        int countOfOne = Collections.frequency(nums, 1);
        System.out.println("countOfOne = " + countOfOne);

        Collections.replaceAll(nums, 5, 50);
        System.out.println("after replaceAll = " + nums);

        Collections.sort(nums, Collections.reverseOrder());
        System.out.println("after reverse sort" + nums);

        Collections.shuffle(nums);
        System.out.println("After shuffle = " + nums);
        
        
        




    }
}
