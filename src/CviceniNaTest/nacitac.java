package CviceniNaTest;

import java.util.Scanner;

public class nacitac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int num = 0;
        while(input != -1){
            num = num + input;
            input = sc.nextInt();
        }
        System.out.println(num);
    }

}
