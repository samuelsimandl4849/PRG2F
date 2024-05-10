package oop;



public class MathPractice {
    public static double addition(double a, double b){
        return a+b;
    }
    public double multiplication(double a, double b){
        return a*b;
    }
    public static void main(String[] args) {
        double a = 2;
        double b = 16;
        System.out.println(MathPractice.addition(a,b));

        MathPractice practice = new MathPractice();
        practice.multiplication(a,b);
    }

}
