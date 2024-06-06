package hangman;

import java.util.ArrayList;

public class Game {
    String secret;
    final String[] WORDS = {"kolo", "skola", "trychtyr", "akcelerator", "mezopotamie"};
    Player p;
    ArrayList<String> guessed;
    Reader reader;

    public Game(Player p, Reader reader) {
        this.p = p;
        this.reader = reader;
    }

    public static void main(String[] args) {

    }
}
