package Strings;

import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        char letter = 'A';
        char num = '5';
        char specials = ';';
        char special = '\n';//odradkovani
        char tab = '\t';
        System.out.println("hello" + special + "World");

        String greet = "Hello world!";
        System.out.println(greet);

        System.out.println("Delka je " + greet.length());
        System.out.println("Na pozici 3 je " + greet.charAt(3));
        String addition = " It's friday!";
        System.out.println(greet + addition);
        String fullGreet = greet + addition;
        System.out.println(fullGreet);

//        //Porovnavani! - takhle ne
//        if (fullGreet == (greet + addition)){
//            System.out.println("They're same");
//        } else {
//            System.out.println("They're not same.");
//        }//Porovnavani! - ano
        if (fullGreet.equals(greet+addition)){
            //vezmi fullGreet a porovnej to s tim, co ti dam do (...)
            System.out.println("They're same");
        } else {
            System.out.println("They're not same.");
        }

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println("Zadal jsi " + input);

        //do nove promenne
//        String inputUpper = input.toUpperCase();
//        System.out.println("Zadal jsi (velkymi pismeny): " + inputUpper);

        //zmenit
        input = input.toUpperCase();
        System.out.println("Po zmene: " + input);

        String word = "hello";
        if (word.contains("el")){
            System.out.println("Obsahuje 'el' ");
            int indexE = word.indexOf('e');
            if (indexE >= 0){
                System.out.println("'e' se nachazi na indexu " + indexE);
            }
        }

        System.out.println("'ll' je na indexu: " + word.indexOf("ll"));
    }
}
