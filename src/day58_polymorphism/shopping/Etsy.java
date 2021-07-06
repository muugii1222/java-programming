package day58_polymorphism.shopping;

public class Etsy extends OnlineShop implements HandMade {
    @Override
    public void makeAndSellFromHome() {
        System.out.println("Hand made items sell on Etsy");
    }

    @Override
    public void buy() {
        System.out.println("Buying items from Etsy");
    }

    @Override
    public void sell() {
        System.out.println("Selling items on Etsy");
    }
}
