package oop;

public class WineShop {
    int bottles;
    int balance;
    final int PRICE_PER_SELL = 500;
    final int PRICE_PER_BUY = 250;

    public WineShop(int bottles, int balance) {
        this.bottles = bottles;
        this.balance = balance;
    }

    void sell(int bottles){
        if (this.bottles < bottles){
            System.out.println("Nepodarilo se prodat");
        } else {
//        this.bottles = this.bottles - bottles;
            this.bottles -= bottles;
            balance += PRICE_PER_SELL * bottles;
        }
    }

    void buy(int bottles){
        if (balance >= PRICE_PER_BUY * bottles){
            balance -= PRICE_PER_BUY * bottles;
            this.bottles += bottles;
        } else {
            System.out.println("Nepodarilo se nakoupit");
        }
    }

    void printInfo(){
        System.out.println("Na sklade " + bottles);
        System.out.println("Na ucte " + balance);
    }

}
