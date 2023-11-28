package P2_2023_1.Pais;

import java.util.Scanner;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Pais> lista = new CriaPaises().retornaPaises();
        System.out.println("Insira o código de um pais: ");
        Pais pais = new Pais(scan.nextLine());
        boolean x = Pais.exists(lista, pais);
        if (x) {
            System.out.println("Encontrado!\n" + lista.get(lista.indexOf(pais)).getNome() + "\n" + lista.get(lista.indexOf(pais)).getDimensao() + "\n" + lista.get(lista.indexOf(pais)).getFronteira());
        }

        String[] str = {
          "BRA#Brasil#69420",
          "JP#Japão#1337420",
          "UK#Reino Unido",
        };

        ArrayList<Pais> lista2 = new CriaPaises().retornaPaises(str);
        System.out.println(lista2);
    }
}
