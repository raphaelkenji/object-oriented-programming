package Escola;

import java.util.Scanner;

public class AlunoTeste {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o nome do aluno: ");
        aluno.setNome(scanner.nextLine());
        System.out.println("Insira a primeira nota do aluno: ");
        aluno.setNota_1(scanner.nextDouble());
        System.out.println("Insira a segunda nota do aluno: ");
        aluno.setNota_2(scanner.nextDouble());
        System.out.println(aluno);
    }
}
