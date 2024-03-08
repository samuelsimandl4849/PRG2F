package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Separating {
    public static void main(String[] args) {
        String song = "Dream on;Aerosmith;(1973)";
        String[] texts = {"first", "second", "another"};
        System.out.println(texts[1]);//vypis druheho
        String[] splits = song.split(";");
        System.out.println(Arrays.toString(splits));
        String songName = splits[0];
        String composer = splits[1];
        String yearOfRelease = splits[2];

        String hello = "hello";
        String something = hello.substring(0,4);
        System.out.println(hello + " sub(0,4): " + something);
        String spanishSuffix = hello.substring(1,3);
        System.out.println(spanishSuffix + " Camino");


        System.out.println("5" + "2");
        String number = "456";
        System.out.println(number + 42);
        int parsing = Integer.parseInt(number);
        System.out.println(parsing + 42);
        int text = 12345;
        String actualText = String.valueOf(text);
        String empty = "";
        String blank = "                 ";

    }
}
