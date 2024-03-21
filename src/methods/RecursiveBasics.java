package methods;

public class RecursiveBasics {

    static void countdown(int n){
        System.out.println(n);
        n--;
        if (n > 0){
            countdown(n);
        }
    }

    static void nonRecursiveCountdown(int n){
        for (int i = n; i > 0; i--) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        nonRecursiveCountdown(5);
        System.out.println("---");
        countdown(5);
    }
}
