package Compila;

public class Exercicio_4 {
    public static void main(String[] args) {
        System.out.println(new Exercicio_4().calcula(2,3));
    }
    public double calcula(double a, double b) {
        return (a+b) * (a*0.1) + (b*0.9);
    }
}
