package Escola;

import java.util.Scanner;

public class MochilaTeste {
    public static void main(String[] args) {
        Mochila[] mochilas = new Mochila[4];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < mochilas.length; i++) {
            mochilas[i] = new Mochila();
            mochilas[i].anoFabricacao = scanner.nextInt();
        }

        int soma = 0;
        for (Mochila mochila : mochilas) {
            soma = soma + mochila.anoFabricacao;
        }

        System.out.println("Média dos anos: " + soma / 4);
    }
}
