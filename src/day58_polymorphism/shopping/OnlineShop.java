package day58_polymorphism.shopping;

public abstract class OnlineShop {

    public abstract void buy();
    public abstract void sell();
    public void ship(){
        System.out.println("Shipping the purchased items");
    }


}
