package Strings;

import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {
        //string input
        //string psswd
        //over, ze uzivatel zadal spravne heslo

        Scanner sc = new Scanner(System.in);
//        System.out.println("Zadej heslo:");
//        String input = sc.nextLine();
//        String psswd = "secret";
//        if (input.equals(psswd)){
//            System.out.println("They're same");
//        }
        //promena rc - rodne cislo,
        //over, zda je spravne napsano
        //over, zda se jedna o muze/zenu
        String rc = "015911/1234";
        //kontrola lomitka
        if (rc.charAt(6) == '/'){
            System.out.println("Lomitko OK");
            //delka 11 znaku
            if (rc.length() == 11) {
                System.out.println("Delka rc OK");
                if (rc.charAt(2) == '5' || rc.charAt(2) == '6') {
                    System.out.println("Jedna se o zenu");
                } else {
                    System.out.println("Jedna se o muze");
                }
            }
        }


        //prochazi hesla,
        //urci, zda uzivatel heslo uhodl (alespon jedno)
        String[] passwords = {"alkohol", "sobota", "klic", "strom"};
        System.out.println("Zadej heslo");
        String input = sc.nextLine();
        for (int i = 0; i < passwords.length; i++) {
            if (passwords[i].equals(input)){
                System.out.println("Uhadl jste heslo");
                break;
            }
        }

        //pole jmen
        String[] names = {"Adam Klíma", "Jana Nová", "Jan Boháč", "Jan Whatever", "Franz Ferdinand"};
        //vypis z pole vsechny Honzy
        for (int i = 0; i < names.length; i++) {
            if (names[i].contains("Jan ")){
                System.out.println(names[i]);
            }
        }

    }
}
