package blackJack;

import java.util.Scanner;

public class BlackJack {
    Player player;
    int dealerValue;
    int bet;

    public BlackJack(Player player) {
        this.player = player;
    }


    void start(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Kolik chces vsadit?");
        int input  = sc.nextInt();
        while (player.balance < input){
            System.out.println("Zadej castku, kterou si muzes dovolit");
            input  = sc.nextInt();
        }
        bet = 2 * input;

    }

    public static void main(String[] args) {
        Player p = new Player("Joel", 1000);
        BlackJack blackJack = new BlackJack(p);
    }
}
