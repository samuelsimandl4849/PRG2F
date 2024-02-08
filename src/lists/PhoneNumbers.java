package lists;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneNumbers {

    public static void main(String[] args) {
        //uzivatel bude zadavat telefoni cisla
        //zadavani ukonci zadanim 'konec'
        //na konci vypisite pouze ceska tel. cisla
        Scanner sc = new Scanner(System.in);
        ArrayList<String> phoneList = new ArrayList<>();
        System.out.println("Zadavej tel. cisla, zadavani ukoncis zadanim 'konec'");
        String input  = sc.nextLine();
        //tel. cislo:
        //  ma predvolbu (+ nebo cislo)
        // obsahuje pouze cisla
        boolean notADigit = false;
        while (!input.equals("konec")){
            if (input.charAt(0) == '+' || Character.isDigit(input.charAt(0))){
                notADigit = false;
                for (int i = 1; i < input.length(); i++) {
                   if (!Character.isDigit(input.charAt(i))){
                       notADigit = true;
                        break;
                   }
                }
                if (!notADigit){
                    System.out.println("Added: " + input);
                    phoneList.add(input);
                }
            }
            input = sc.nextLine();
        }
        System.out.println(phoneList);

        //vypis pouze ceskych
        //pouze ty, ktera zacinaji na +420
        //maji delku 14
        //(maji pouze cisla) < vyreseno vyse
        for (int i = 0; i < phoneList.size(); i++) {
           if (phoneList.get(i).length() == 13){
               if (phoneList.get(i).startsWith("+420")){
                   System.out.println(phoneList.get(i));
               }
           }
        }

    }
}
