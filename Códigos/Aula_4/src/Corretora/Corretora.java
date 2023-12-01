package Corretora;

import java.util.Scanner;

public class Corretora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Imovel[] imovel = new Imovel[5];
        for (int i = 0; i < imovel.length; i++) {
            imovel[i] = new Imovel();
        }
        for (int i = 0; i < imovel.length; i++) {
            System.out.println("Insira o valor para o Endereço " + (i + 1));
            imovel[i].setEndereco(scanner.nextLine());
            imovel[i].setPreco(scanner.nextDouble());
            scanner.nextLine();
        }
        System.out.println("Soma dos valores dos Imóveis: " + calcularSomaPrecos(imovel));
    }

    public static double calcularSomaPrecos(Imovel[] imovel) {
        double soma = 0;
        for (Imovel value : imovel) {
            System.out.println(value);
            soma += value.getPreco();
        }
        return soma;
    }
}
