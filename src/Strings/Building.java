package Strings;

public class Building {

    public static void main(String[] args) {
        String a = "hello";
        String b = " world";
        System.out.println(a+b);

        String numbers = "";


        String palindrome = "hello";
        StringBuilder builder = new StringBuilder(palindrome);
        System.out.println(builder);
        builder.reverse();
        System.out.println(builder);
        builder.insert(2, "NEW");
        System.out.println(builder);
        builder.append("\nAppending");
        System.out.println(builder);
    }
}
