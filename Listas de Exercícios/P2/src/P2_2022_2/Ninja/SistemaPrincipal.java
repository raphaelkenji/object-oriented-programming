package P2_2022_2.Ninja;

import java.sql.SQLOutput;
import java.util.*;

public class SistemaPrincipal {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o nome da Academia: ");
        Academia academia = new Academia(scanner.nextLine());
        System.out.println("Quantos ninjas você deseja cadastrar?");
        int qtd = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < qtd; i++) {
            System.out.println("Nome: ");
            String nome = scanner.nextLine();
            System.out.println("CPF: ");
            String cpf = scanner.nextLine();
            System.out.println("Idade: ");
            int idade = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Tipo: ");
            int tipo = scanner.nextInt();
            scanner.nextLine();
            Ninja n = null;
            switch (tipo) {
                case 1:
                    n = new Genin(cpf, nome, idade);
                    break;
                case 2:
                    n = new Chunin(cpf, nome, idade);
                    break;
                case 3:
                    n = new Jonin(cpf, nome, idade);
                    break;
            }
            academia.matriculaNinja(n);
        }
        System.out.println("Cadastro dos ninjas realizado com sucesso!");
        System.out.println("Insira um CPF. Digite 0 para sair.");
        String busca = scanner.nextLine();
        while (!"0".equals(busca)) {
            Ninja n = new Ninja(busca);
            academia.imprimeDadosNinjaSeExistir(n);
            System.out.println("Insira um CPF. Digite 0 para sair.");
            busca = scanner.nextLine();
        }
        System.out.println(academia);
        List lista = academia.listaNinjas();
        System.out.println(lista);
        Collections.sort(lista);
        System.out.println(lista);
        Map mapa = Utils.retornaMapa(lista);
        System.out.println(mapa);
    }
}
