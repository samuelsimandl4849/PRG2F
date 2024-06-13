package cvika.a2;

import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {
        //staticky
        int[] arr = {1, 5, 789, 1534, 46};
        int[] array = new int[16];
        //napln array random cislama  -49 - 50
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100 - 49);
        }

        //vypis:
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        //alternative vypis:
        System.out.println(Arrays.toString(array));

        //vypis pole pozpatku
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        //vypis vsechna zaporna cisla v poli
        System.out.println("Negative:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();

        //vypis pole zig-zag
        System.out.println("Zig-zag output:");
        for (int i = 0; i < array.length/2; i++) {
            System.out.println(array[i]);
            System.out.println(array[array.length - i - 1]);
        }
    }
}
