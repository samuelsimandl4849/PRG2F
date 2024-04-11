package methods;

import java.io.File;

public class RecursivePractice {

    static void doSomething(){
        System.out.println("Doing something...");
        doSomething();
    }

    static void saharaCountdown(int n){
        System.out.println("Sahara speck #" + n);
        if (n == Integer.MAX_VALUE){
            return;
        }

        saharaCountdown(n+1);
    }

    static int recursiveFactorial(int n){
        if (n <= 1){
            return 1;
        }
        return n * recursiveFactorial(n-1);
    }

    static int factorial(int n){
        int result = 1;
        for (int i = 0; i < n; i++) {
            result = result*(n-i);
        }
        return result;
    }

//    public static void tree(File f){
//        if (f.isFile()){
//            System.out.println("Soubor: " + f.getPath());
//        }else {
//            System.out.println("Slozka: " + f.getPath());
//            File[] files = f.listFiles();
//            for(File file : files){
//                tree(file);
//            }
//        }
//    }


    public static void main(String[] args) {
//        doSomething();
//        saharaCountdown(1);
        System.out.println(factorial(6));
        int fact = recursiveFactorial(6);
        System.out.println(fact);
//        File file = new File("C:\\Users\\bohac.infis\\Desktop");
//        tree(file);
    }
}
