package hangman;

import java.util.Scanner;

public class Reader {
    Scanner sc = new Scanner(System.in);

    String readInput(){
        System.out.println("Zadej pismeno");
        String input = sc.nextLine();
        while (input.length() > 1){
            System.out.println("Zadej pouze jedno pismeno");
            input = sc.nextLine();
        }
        return input;
    }
}
