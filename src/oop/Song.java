package oop;

public class Song {
    String name;
    String author;
    int yearOfRelease;
    double rating;

    public void printInfo(){
        System.out.println("Song: " + name);
        System.out.println("Written by: " + author);
        System.out.println("Released: " + yearOfRelease);
        System.out.println("Rated: " + rating);
    }
}
