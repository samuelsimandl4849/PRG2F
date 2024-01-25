package Strings;

import com.sun.security.jgss.GSSUtil;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class InputCheck {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Zadej IP:");
//        String input = sc.nextLine();


        boolean ok = true;
        String input = JOptionPane.showInputDialog("Zadej IP:");
        System.out.println("Zadal jsi " + input);
        //pocitani tecek
        String[] parts = input.split("\\.");

        System.out.println(Arrays.toString(parts));
        if (parts.length == 4) {
            System.out.println("Delka OK");
        } else {
            System.out.println("Neni IP");
            ok = false;
        }


        for (int i = 0; i < parts.length && ok; i++) {

            if (parts[i].isEmpty()) {
                System.out.println("Neni IP!");
                ok = false;
                break;
            }

            for (int j = 0; j < parts[i].length(); j++) {
                char current = parts[i].charAt(j);
                if (!Character.isDigit(current)) {
                    System.out.println("Neni IP!");
                    ok = false;
                    break;
                }
            }
        }
        for (int i = 0; i < parts.length && ok; i++) {
            int number = Integer.parseInt(parts[i]);
            if (number >= 0 && number <= 255) {
                System.out.println((i + 1) + "/" + parts.length + " OK");
            } else {
                System.out.println("Neni IP");
                ok = false;
                break;
            }
        }

    }

}
