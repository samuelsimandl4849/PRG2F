package test;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int HP = 1500;
        int DMG = 0;
        int num = 0;
        while(HP >= 0){
            DMG = (int)(Math.random()*51)+100;
            System.out.println(DMG);
            HP = HP - DMG;
            num++;
        }
        System.out.println("postavu jste uderil "+ num +"x");

    }
}
