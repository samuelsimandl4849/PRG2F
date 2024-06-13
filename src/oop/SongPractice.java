package oop;

public class SongPractice {

    public static void main(String[] args) {
        Song dream = new Song();
        dream.name = "Dream on";
        dream.author = "Aerosmith";
        dream.yearOfRelease =  1973;
        dream.rating = 9.8;

        System.out.println("Nazev: " + dream.name);
        dream.printInfo();

        Song paint = new Song();
        paint.name = "Paint it, black";
        paint.author = "The Rolling stones";
        paint.yearOfRelease = 1966;
        paint.rating = 9.9;
        System.out.println("----");
        paint.printInfo();

    }
}
