package mugi;

public class MultiplicationTablePractice {
    public static void main(String[] args) {
        for (int i = 1; i <=10; i++){
            int num = 3;
            int total = num * i;
            System.out.println(num + " x " + i + " = " + num * i);

        }

        for (int i = 0; i < 10; i++){
            switch (i) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                case 8:
                    System.out.println("Invalid day");
                    break;

            }
        }
    }
}
