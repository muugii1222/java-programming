package day18_conditions_practice_strings_intro;
/*
Make => Mercedes
    Model =>  E
        leasePrice = 500
    Model => A
        leasePrice = 400

Make => Audi
    Model =>  SQ5
        leasePrice = 552
    Model => A3    
        leasePrice = 412
 */
public class CarLeasingTest {
    public static void main(String[] args) {
        String make = "Benz";
        String model = "E";
        double leasePrice = 0.0;

//        if (make.equals("Mercedes") && model.equals("E")){
//            leasePrice = 500.0;
//        } else if (make.equals("Mercedes") && model.equals("A")){
//            leasePrice = 400.0;
//        }

        if (make.equals("Mercedes")) {
            if (model.equals("E")) {
                leasePrice = 500.0;
            } else if (model.equals("A")) {
                leasePrice = 400.0;
            }
        } else if (make.equals("Audi")) {
            if (model.equals("SQ5")) {
                leasePrice = 552.0;
            } else if (model.equals("A3")) {
                leasePrice = 412.0;
            }
        } else {
            System.out.println("Invalid make");
            return; //exit program
        }
        System.out.println("make = " + make);
        System.out.println("model = " + model);
        System.out.println("leasePrice = " + leasePrice);

    }
}