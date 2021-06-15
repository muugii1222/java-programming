package office_hours.Practice_06_14_2021;

/* Create a class Twix [Child class]

 * Inherits Candy class

 * constructor that invokes the parent constructor

 * extra: static hiding, final, sub class

 */

/*
* Twix is a Candy
* Twix is a object
* Twix has a brand
* Twix has a Quantity
* */

public class Twix extends Candy{

    public Twix(int quantity, boolean hasPeanuts) {
        super("Twix", quantity, hasPeanuts);
    }
}
