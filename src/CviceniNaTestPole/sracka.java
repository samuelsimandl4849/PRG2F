package CviceniNaTestPole;

import java.util.Scanner;

public class sracka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {1, 2, 3, 4, 5, 6, 6};
        int vyskyt = 0;
        int[] index = new int[array.length];
        int input = sc.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == input){
                index[vyskyt] = i;
                vyskyt++;

            }
        }
    }
}
