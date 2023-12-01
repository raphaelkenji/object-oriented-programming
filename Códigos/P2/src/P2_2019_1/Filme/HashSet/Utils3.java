package P2_2019_1.Filme.HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Utils3 {
    public static Set processa (String[] filmes) {
        Set<Filme> set = new HashSet<>();
        for (int i = 0; i < filmes.length; i++) {
            String[] dados = filmes[i].split("#");
            Filme f = new Filme();
            f.setId(Integer.parseInt(dados[0]));
            f.setTitulo(dados[1]);
            f.setAno(Integer.parseInt(dados[2]));
            set.add(f);
        }
        return set;
    }
}
