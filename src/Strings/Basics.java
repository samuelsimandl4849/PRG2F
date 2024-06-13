package Strings;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        char letter = 'A';
        char num = '9';
        char otherNum = '5';
        char other = '*';
        char lineBreak = '\n';//odradkovani
        char tab = '\t';//tabulator
        System.out.println("Hello" + lineBreak + "World");
        System.out.println(otherNum + num);
        Scanner sc = new Scanner(System.in);

        String word = "Hello";
        String otherWord = "World!";
        System.out.println(word + " " + otherWord);

        String something = "neco";
        System.out.println("Zadej slovo");
        String somethingElse = sc.nextLine();
        System.out.println("Zadal jsi " + somethingElse);
        //porovnani
        if (something.equals(somethingElse)){
            System.out.println("They're same");
        }
        System.out.println(something.charAt(2));
        System.out.println(something.toUpperCase());
        System.out.println(something);
    }
}
