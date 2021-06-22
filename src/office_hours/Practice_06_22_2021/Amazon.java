package office_hours.Practice_06_22_2021;

/*
Create a concrete class Amazon
    - Inherit OnlineShopping and implement all abstract methods
*/

public class Amazon extends OnlineShopping implements AllowUsersToSell{

    @Override
    public void viewCar() {
        System.out.println("Viewing Amazon cart");
    }

    @Override
    public boolean payForShipping(double price) {
        return price > 50;
    }

    @Override
    public void buyItem() {
        System.out.println("Buying item from Amazon");
    }

    @Override
    public void returnItem() {
        System.out.println("Returning item for Amazon");
    }

    @Override
    public void uploadProduct() {
        System.out.println("Amazon seller");
    }
}
