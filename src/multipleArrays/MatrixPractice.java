package multipleArrays;

import java.util.Scanner;

public class MatrixPractice {
    public static void main(String[] args) {
        int[][] matrix = new int[10][10];
        //vygenerovani: randoms 10 - 99
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int)(Math.random()*90+10);
            }
        }

        //vypsani n-teho radku, n zada uzivatel
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej cislo radku");
        int input = sc.nextInt();
        for (int i = 0; i < matrix[input].length; i++) {
            System.out.print(matrix[input][i] + "\t");
        }
        System.out.println("\n");

        //vypsani n-teho sloupce, n zada uzivatel
        System.out.println("Zadej cislo sloupce");
        input = sc.nextInt();
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(matrix[i][input]);
        }
        System.out.println();
        //vytisk
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        //vytisk - jinak
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }


        //nasobilka: uzivatel zada N vygeneruju + vypisu 2D pole s nasobilkou
        System.out.println("Zadej cislo:");
        input = sc.nextInt();
        int[][] multiplicationTable = new int[input][input];
        for (int i = 0; i < multiplicationTable.length; i++) {
            for (int j = 0; j < multiplicationTable[i].length; j++) {
                multiplicationTable[i][j] = (j+1)*(i+1);
                System.out.print(multiplicationTable[i][j] + "\t");
            }
            System.out.println();
        }

    }

}
