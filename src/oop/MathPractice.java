package oop;

public class MathPractice {

    public double addition(double a, double b){
        return a+b;
    }

    public static double multiplication(double a, double b){
        return a*b;
    }

    public static void main(String[] args) {
        double a = 4.5;
        double b = 9.9;

        System.out.println(MathPractice.multiplication(a,b));

        MathPractice practice = new MathPractice();

        System.out.println(practice.addition(a, b));

    }
}
