package CviceniNaTest;

import java.util.Scanner;

public class square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int velikost = sc.nextInt();
        for (int i = 1; i <= velikost; i++){
            for (int j = 0; j < velikost; j++) {
                if ((j+i) % 2 == 0){
                    System.out.print("X ");
            } else {
                    System.out.print("O ");
                }

            }
            System.out.println();
        }

    }
}

