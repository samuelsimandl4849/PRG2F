package cycles;

public class randomloops {
    public static void main(String[] args) {
       int num1 = (int)(Math.random()*21);
       int num2 = (int)(Math.random()*21);
       int tries = 1;
       System.out.println(num2 + ", " + num1);
       while (num2 != num1){
           num1 = (int)(Math.random()*21);
           num2 = (int)(Math.random()*21);
           System.out.println(num2 + ", " + num1);
           tries++;

       }
        System.out.println("trvalo to " + tries + "pokusu");
        int counter = 0;
        for (int i = 0; i < 100; i++){
            num1 = (int)(Math.random()*21);
            num2 = (int)(Math.random()*21);
            System.out.println(num2 + ", " + num1);
            if (num1 == num2){
                counter++;
            }

        }
        System.out.println("stejna cisla padla " + counter + "x");


    }
}
