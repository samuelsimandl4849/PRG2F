package methods;

public class Referencing {

    static void something(int a){
        System.out.println(a);
        a = a + 5;
        System.out.println(a);
    }

    static void somethingElse(int[] array){
        System.out.println(array[1]);
        array[1] = 3;
        System.out.println(array[1]);
    }
    public static void main(String[] args) {
        int a = 5;
        System.out.println(a);
        something(a);
        System.out.println(a);

        int[] array = {5, 10};
        System.out.println(array[1]);
        somethingElse(array);
        System.out.println(array[1]);
    }
}