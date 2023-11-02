package CviceniNaTest;

import java.util.Scanner;

public class square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int velikost = sc.nextInt();
        for (int i = 1; i <= velikost * velikost ; i++){
            if (i % velikost == 0){
                System.out.println(i);
                //println jakoby logicky udela novej line, takze pri kazdym delitelnym to shodi dolu
            } else {
                System.out.print(i+" ");
                //tadyto tam jenom hodi tu mezeru
            }
        }

    }
}

