package CviceniNaTestPole;

import java.util.Arrays;
import java.util.Scanner;

public class UserArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("napis velikost pole");
        int size = sc.nextInt();
        int[] out = new int[size];
        for (int i = 0; i < size; i++) {
        out[i] = (int)(Math.random()*100);
        }
        System.out.println(Arrays.toString(out));
    }
}
