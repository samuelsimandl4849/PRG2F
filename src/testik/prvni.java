package testik;

import java.util.Scanner;

public class prvni {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[20];
        int out = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*200-100);
            out = out + array[i];
        }
        if (out >= 0){
            System.out.println(out);
        }else{
            System.err.println(out);
        }
    }
}
