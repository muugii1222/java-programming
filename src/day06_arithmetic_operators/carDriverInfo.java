package day06_arithmetic_operators;

public class carDriverInfo {
    public static void main(String[] args){
        String carModel = "Sienna";
        String driverName = "Mugi";
        String licenseNum = "b2345678";
        byte speed = 120;
        boolean automatic = true;
        char licenseClass = 'A';

        System.out.println("Car model:\t\t" + carModel);
        System.out.println("Driver Name:\t" + driverName);
        System.out.println("License Number:\t" + licenseNum);
        System.out.println("Speed:\t\t\t" + speed);
        System.out.println("Automatic:\t\t" + automatic);
        System.out.println("license Class:\t" + licenseClass);

        System.out.println(driverName + " is driving " + carModel);
        System.out.println(carModel + "'s speed is " + speed + "mph");
        System.out.println("Is car automatic? " + automatic);

//        can't put different type together without string
//        System.out.println(licenseClass + automatic); not work

        System.out.println(licenseClass + " " + automatic);

    }
}
