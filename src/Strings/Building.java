package Strings;

public class Building {

    public static void main(String[] args) {
        String a = "Hello";
        String b = " world!";
        System.out.println(a + b);

//        String numbers = "";
//        for (int i = 0; i < 100; i++) {
//            numbers += i;
//        }
//        System.out.println(numbers);
//
        String palindrome = "kayak";

        StringBuilder builder = new StringBuilder();

        builder.append("ka");
        builder.append("yak");
        builder.reverse();

        System.out.println(builder);
        builder.insert(3, "SOMETHING");
        System.out.println(builder);
        System.out.println(builder);
    }


}
