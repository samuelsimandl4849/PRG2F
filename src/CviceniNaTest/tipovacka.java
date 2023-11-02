package CviceniNaTest;

import java.util.Scanner;

public class tipovacka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = (int)(Math.random()*100)+1;
        int tip = sc.nextInt();
        while(tip != num){
            if(tip > num){
                System.out.println("cislo je mensi");
            }else{
                System.out.println("cislo je vetsi");
            }
            tip = sc.nextInt();
        }

        System.out.println("UHODL JSTE!!!!!!!!!!");



    }
}
