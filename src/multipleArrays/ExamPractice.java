package multipleArrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ExamPractice {


    public static void main(String[] args) {
        //2D pole, uzivatel voli cislo slouce a vypise sumu
        int[][] numbers = {
                {3,5,6,3,1},
                {3,8,1,2,1},
                {9,1,6,3,1},
                {3,5,6,3,1},
                {3,5,6,3,1}
        };
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej cislo sloupce");
        int input = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i][input]);
            sum += numbers[i][input];
        }

        System.out.println("Soucet sloupce " + input + ": " + sum);


        ArrayList<String> listOfStrings = new ArrayList<>();
        listOfStrings.add("Hello");//vkladani
        listOfStrings.get(0); // vybrani prvku - index 0
        listOfStrings.contains("Hello"); // jestli obsahuje 'hello'
        listOfStrings.size(); //velikost pole << ekvivalent pole.length
    }
}
