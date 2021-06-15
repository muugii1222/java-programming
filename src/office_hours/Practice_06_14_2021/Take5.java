package office_hours.Practice_06_14_2021;

/*
Create a class Take5 [Child class]

    * Inherits Candy class

    * constructor that invokes the parent constructor

    * extra: static hiding, final

* */

public class Take5 extends Candy{ //it's complaining without constructor, because parent class doesn't have default constructor

    // public Take5(){
    // super()
    // }

    public Take5(int quantity, boolean hasPeanuts) { //removed String brand, and hardcoded "Reese, to avoid to repeat brand over
        super("Reese", quantity, hasPeanuts);

    }
}
