package day17_ternary_nested_conditions;
/*
TeslaNestedIf

char model = 'S';
trim -> "Long range"


when model 'S'
    if trim is "long range":
        "range: 412"
        "top speed: 155 mph"
        "0-60- 3.1sec"

    if trim is "Plaid":
        "range: 390"
        "top speed: 200 mph"
        "0-60- 1.99sec"

    if trim is "Plaid+":

        "range: 520+"
        "top speed: 200 mph"
        "0-60- <1.99sec"
when model is '3'
    ....
 */
public class Tesla {
    public static void main(String[] args) {
        char model = 'X';
        String trim = "long range";

        if (model == 'S') {
            if (trim.equals("long range")) {
                System.out.println("range: 412\ntop speed: 155 mph\n0-60- 3.1sec");
            } else if (trim.equals("Plaid")) {
                System.out.println("range: 390\ntop speed: 200 mph\n0-60- 1.99sec");
            } else if (trim.equals("Plaid+")) {
                System.out.println("range: 520\ntop speed: 200 mph\n0-60- <1.99sec");
            }
        } else if (model == 'X') {
            if (trim.equals("long range")) {
                System.out.println("range: 360\ntop speed: 155 mph\n0-60- 3.8sec");
            } else if (trim.equals("Plaid")) {
                System.out.println("range: 340\ntop speed: 163 mph\n0-60- 2.5sec");
            }
        } else if (model == 'Y') {
            if (trim.equals("long range")) {
                System.out.println("range: 326\ntop speed: 135 mph\n0-60- 4.8sec");
            } else if (trim.equals("Performance")) {
                System.out.println("range: 303\ntop speed: 155 mph\n0-60- 3.5sec");
            }
        }
    }

}