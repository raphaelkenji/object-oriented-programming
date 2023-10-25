package Compila;

public class Exercicio_5 {
    public static void main(String[] args) {
        Exercicio_5 s = new Exercicio_5();
        System.out.println(s.calcula(2,3));
    }
    public double calcula(double a, double b) {
        return (a+b) * (a*0.1) + (b*0.9);
    }
}