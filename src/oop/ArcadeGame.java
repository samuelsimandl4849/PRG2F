package oop;

public class ArcadeGame {
    final int MAX_PLAYERS = 3;
    int score;
    int playersJoined;
    int highestScore;

    public ArcadeGame() {
        playersJoined = 0;
        score = 0;
        highestScore = 0;
    }

    void login(){
        if (playersJoined < MAX_PLAYERS){
            playersJoined++;
        } else {
            System.out.println("Nekdo jiz hraje");
        }
    }

    void logout(){
        if (playersJoined >0 ){
            playersJoined--;
            if (playersJoined == 0){
                score = 0;
            }
        } else {
            System.out.println("Nikdo nehraje");
        }
    }

    void scoreIncrease(int score){
        if (playersJoined > 0){
            this.score += score;
            if (this.score > highestScore){
                highestScore = this.score;
            }
        } else {
            System.out.println("Nikdo nehraje!!");
        }
    }

    void scoreDecrease(int score){
        if (playersJoined > 0 && this.score >= score){
            this.score -= score;
        } else{
            System.out.println("Skore nelze snizit");
        }
    }

    public int getScore() {
        System.out.println(score);
        return score;
    }

    public int getHighestScore() {
        return highestScore;
    }
}
