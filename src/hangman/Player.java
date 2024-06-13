package hangman;

public class Player {
    String name;
    int tries;

    public Player(String name) {
        this.name = name;
    }

    public void resetTries(){
        this.tries = 10;
    }
}
