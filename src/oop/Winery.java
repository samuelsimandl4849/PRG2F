package oop;

public class Winery {
    public static void main(String[] args) {
        WineShop shop = new WineShop(10, 50000);
        shop.printInfo();
        shop.sell(5);
        shop.sell(10);
        shop.printInfo();
        shop.buy(50);
        shop.printInfo();
    }
}
