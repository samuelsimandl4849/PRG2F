package methods;

public class Basics {

    public static void greetings(){
        System.out.println("Hello world");
    }

    public static int sum(int a, int b){
        return a + b;
    }

    public static void main(String[] args) {
        greetings();
        int result = sum(40, 2);
        System.out.println(sum(3,3));
        Accessibility.greetings();
    }
}
