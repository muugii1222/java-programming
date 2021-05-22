package day37_methods_overloading;

public class VarArgs {
    public static void main(String[] args) {
        addNumbers(3, 5, 6, 7, 9, 3, 4);
        addNumbers(4, 5);
        addNumbers(56, 78, 900);
        addNumbers();
    }

// . . . works like Array , there is no limit
    public static void addNumbers(int... nums) {
        int sum = 0;
        for (int n : nums){
            sum +=n;
        }
        System.out.println("sum = " + sum);
    }


}
