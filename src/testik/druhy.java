package testik;

public class druhy {
    public static void main(String[] args) {
        int[] pole = {1, 2, 3, 20, 500, 2, 6, 8, 9, 10};
        for (int i = 0; i < pole.length; i++) {
            if (pole[i] >= (-10) && pole[i] <= 10){
                System.out.print(pole[i] + " ");
            }
        }
    }
}
