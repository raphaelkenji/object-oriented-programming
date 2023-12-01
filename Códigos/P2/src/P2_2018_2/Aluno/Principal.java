package P2_2018_2.Aluno;

import java.util.*;

public class Principal {
    public static void main(String[] args) {
        // Gerado pelo GPT, não há Main explicita na questão.

        AlunoRegular aluno1 = new AlunoRegular("154-3");
        aluno1.setNome("Simba Silva");
        aluno1.setNota(3.7);

        AlunoEspecial aluno2 = new AlunoEspecial("553-2");
        aluno2.setNome("Juju Juba");
        aluno2.setNota(10.0);

        List<Aluno> listaAlunos = new ArrayList<>();
        listaAlunos.add(aluno1);
        listaAlunos.add(aluno2);

        Utils.ordena(listaAlunos);

        System.out.println("Alunos ordenados por nome:");
        System.out.println(listaAlunos);

        Aluno aluno3 = new AlunoRegular("154-3");
        System.out.println("Existe aluno com ID 154-3 na lista? " + Utils.existe(listaAlunos, aluno3));

        Set<String> conjuntoDados = new HashSet<>();
        conjuntoDados.add("154-3#Simba Silva#3.7#R");
        conjuntoDados.add("553-2#Juju Juba#10.0#E");

        Map<String, Aluno> mapaAlunos = new Utils().retornaDados(conjuntoDados);

        System.out.println("\nMapa de alunos:");
        System.out.println(mapaAlunos);
    }
}

