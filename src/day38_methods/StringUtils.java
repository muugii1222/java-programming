package day38_methods;

public class StringUtils {
    public static void main(String[] args) {
        System.out.println(isNullOrEmpty(""));

        String word = null;
        System.out.println(isNullOrEmpty(word));

        System.out.println("isPalindrome = " + isPalindrome("civic"));
        System.out.println("isPalindrome = " + isPalindrome("tamir"));

        System.out.println(reverse("munkhjargal"));

    }

    public static boolean isNullOrEmpty (String str){
        return (str == null || str.isEmpty()); // GOOD --> have to check null first
//        return (str.isEmpty() || str == null);  --> NullPointerException
//        return (str == null | str.isEmpty()); --> this will give NullPointerException because you are using one pipe which forces the program to check both sides


//        if (str == null || str == ""){
//            return true;
//        }
//        return false;

    }

    public static boolean isPalindrome (String str){
        str = str.toLowerCase();
        for (int i = 0; i < str.length()/2; i++){
            if (str.charAt(i) != str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }

    public static String reverse (String str){
        String reverseStr = "";
        for(int i = str.length()-1; i>=0; i--){
            reverseStr += str.charAt(i);
        }
        return reverseStr;
    }
}
