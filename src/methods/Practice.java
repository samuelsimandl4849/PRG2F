package methods;

import java.util.Arrays;

public class Practice {

    public static void greetings(String name) {
        System.out.println("Hello " + name);
        System.out.println("Have a nice day");
    }

    public static int rectangleArea(int width, int height) {
        return width * height;
    }

    public static int randomNumber(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public static int[] randomArray(int length, int min, int max){
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = randomNumber(min, max);
        }
        return array;
    }

    //time convert
    public static String minuteConvert(int seconds){
        String time;
        int min;
        int sec;

        return "tbd";
    }

    public static void main(String[] args) {
        greetings("Carl");
        greetings("Simonne");
        int area = rectangleArea(4, 5);
        System.out.println(Arrays.toString(randomArray(10, 50, 100)));
    }
}
