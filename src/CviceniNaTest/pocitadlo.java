package CviceniNaTest;

public class pocitadlo {

    public static void main(String[] args) {
        int counter = 0;
        for (int i = 0; i <= 100000; i++ ){
           int num = (int)(Math.random()*101);
           if (num == 42){
               counter = counter + 1;
           }
        }
        System.out.println(counter);
    }
}
