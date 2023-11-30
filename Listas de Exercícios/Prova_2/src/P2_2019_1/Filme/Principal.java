package P2_2019_1.Filme;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Principal {
    public static void main(String[] args) {
        List filmes = new Utils3().processa(new LocAntiga().getFilmes());
        System.out.println("Quantidade de filmes existente na locadora: " + filmes.size());

        Map <String, Integer> contaFilmes = new HashMap<>();
        for (int i = 0; i < filmes.size(); i++) {
            Filme filme = (Filme) filmes.get(i);
            if (contaFilmes.containsKey(filme.getTitulo())) {
                contaFilmes.put(filme.getTitulo(), contaFilmes.get(filme.getTitulo()) + 1);
            } else {
                contaFilmes.put(filme.getTitulo(), 1);
            }
        }
        System.out.println("Quantidade de cada título : " + contaFilmes);

        System.out.println(filmes);
        Collections.sort(filmes);
        System.out.println(filmes);
    }
}
