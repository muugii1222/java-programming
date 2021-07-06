package day58_polymorphism.shopping;

public class OnlineShoppingTest {
    public static void main(String[] args) {
        OnlineShop onlineShop1 = new Amazon();
        onlineShop1.buy();
        onlineShop1.sell();
        onlineShop1.ship();

        Prime onlineShop2 = new Amazon();
        onlineShop2.primeShipping();

        OnlineShop onlineShop3 = new Etsy();
        onlineShop3.ship();
        onlineShop3.buy();
        onlineShop3.sell();

        HandMade onlineShop4 = new Etsy();
        onlineShop4.makeAndSellFromHome();




    }
}
