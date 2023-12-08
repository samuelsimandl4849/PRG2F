package Strings;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        //Provnani + nacteni:
        //uzivatel zada input, overte, zda je roven heslu
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej heslo:");
        String input = "neco";
        String password = "secret";
        if (input.equals(password)){
            System.out.println("Heslo OK");
        }

        //validace RC
        //zkontroluje, ze RC je OK
        //vypise, zda se jedna o muze/zenu
        String rc = "005209/2121";
        if (rc.length() == 11){
            System.out.println("Delka je OK");
            if (rc.charAt(6) == '/'){
                System.out.println("Lomitko je OK");
                if (rc.charAt(2) == '5' || rc.charAt(2) == '6'){
                    System.out.println("Jedna se o zenu");
                } else{
                    System.out.println("Jedna se o muze");
                }
            }
        }


        //Uzivatel zada input
        //vypisete, zda se trefil:
        //a) presne
        //b) bez malych/velkych pismen
        String[] passwords = {"automat", "kobLiHa", "0132546", "liverp00l"};
        System.out.println("Zadej heslo:");
        input = sc.nextLine();
        for (int i = 0; i < passwords.length; i++) {
            //var a
            if (input.equals(passwords[i])){
                System.out.println("Correct!");
                break;
            }
            //var b
            if (passwords[i].toLowerCase().equals(input.toLowerCase())){
                System.out.println("Correct! (case ignored)");
//                break;
            }
            //var b - jinak
            if (input.equalsIgnoreCase(passwords[i])){
                System.out.println("Correct!  (case ignored)");
//                break;
            }
        }

        //pole jmen - vypište pouze Honzy
        String[] names = {"Jan Karel", "Karel Jan", "Franta Omáčka", "Franta Vomáčka",
                        "Jan Novák", "Jana Stará", "Franz Ferdinand"};
        for (int i = 0; i < names.length; i++) {
            if (names[i].startsWith("Jan ")){
                System.out.println(names[i]);
            }
        }
        
        //Ze stringu mixed, vypiste pouze cisla
        String mixed = "12he54he213";
        System.out.println("Values:");
        for (int i = 0; i < mixed.length(); i++) {
            if (Character.isDigit(mixed.charAt(i))){
                System.out.println(mixed.charAt(i));
            }
        }
        //Ukazka replace:
        String greeting = "Hello world";
        String replaced = greeting.replace(" ", "|");
        System.out.println(replaced);
    }
}
