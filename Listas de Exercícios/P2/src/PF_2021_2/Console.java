package PF_2021_2;

import java.util.ArrayList;
import java.util.List;

public class Console {
    public static void main(String[] args) {
        List a = new ArrayList();
        String x = "virgem";
        a.add(x);
        a.add(x);
        a.add(x);
        x = "aquario";
        a.add("leao");
        a.add("escorpiao");
        a.add("libra");
        int numero = 13;
        metodoA(numero);
        System.out.println(numero);
        metodoC(a);
        metodoB(a);
        metodoD(a);
        System.out.println(a);
        int i = 0;
        metodoE(i);
        System.out.println(i);
    }
    public static int metodoA (int numero) {
        numero = 11;
        System.out.println(numero);
        return numero;
    }
    public static void metodoB (List c) {
        c.add("gemeos");
    }
    public static void metodoC (List a) {
        a = new ArrayList();
        a.add("virgem");
    }
    public static void metodoD (List c) {
        metodoB(c);
        metodoC(c);
    }
    public static void metodoE (int numero) {
        ++numero;
        numero++;
    }
}