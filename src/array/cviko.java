package array;

import java.util.Arrays;

public class cviko {
    public static void main(String[] args) {
        int[] pole = {5, 32, 21, 15};
        int[] pole2 = new int[10];

        for (int i = 0; i < pole.length; i++) {
            System.out.println(pole[i]);
        }

        for (int i = 0; i < pole2.length; i++) {
            pole2[i] = (int)(Math.random()*101);
        }

        for (int i = 0; i < pole2.length; i++) {
            System.out.println(pole2[i]);
        }
        System.out.println(Arrays.toString(pole2));
    }

    }

    

