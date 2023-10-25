package Compila;

public class Exercicio_3 {
    public static void main(String[] args) {
        System.out.println(calcula(2,3));
    }
    // Não funciona, pois referencia um método não estático.
    // public static double calcula(double a, double b) {
    //        return (a+b) * (a*0.1) + (b*0.9);
    //    }
    public static double calcula(double a, double b) {
        return (a+b) * (a*0.1) + (b*0.9);
    }
}