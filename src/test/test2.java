package test;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int PIN = sc.nextInt();
        while (PIN >= 9999 || 1000 >= PIN ){
            System.out.println("spatne");
            PIN = sc.nextInt();

    }
        System.out.println("spravne");



    }
}
