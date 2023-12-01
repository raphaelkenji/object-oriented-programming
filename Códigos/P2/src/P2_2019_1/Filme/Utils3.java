package P2_2019_1.Filme;

import java.util.List;
import java.util.ArrayList;

public class Utils3 {
    public List processa (String[] filmes) {
        List lista = new ArrayList();
        for (int i = 0; i < filmes.length; i++) {
            String[] dados = filmes[i].split("#");
            Filme filme = new Filme();
            filme.setId(Integer.parseInt(dados[0]));
            filme.setTitulo(dados[1]);
            filme.setAno(Integer.parseInt(dados[2]));
            lista.add(filme);
        }
        return lista;
    }
}
