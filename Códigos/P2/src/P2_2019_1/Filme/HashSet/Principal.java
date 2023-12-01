package P2_2019_1.Filme.HashSet;

import java.util.*;

public class Principal {
    public static void main(String[] args) {
        String[] strfilmes = new LocAntiga().getFilmes();
        Set<Filme> setfilmes = Utils3.processa(strfilmes);
        Set<String> nomes = new HashSet<>();

        for (Filme filme : setfilmes) {
            nomes.add(filme.getTitulo());
        }

        for (String id : nomes) {
            Filme f = new Filme();
            f.setTitulo(id);
            int freq = Collections.frequency(setfilmes, f);
            System.out.println("ID: "+ id + "/ Frequência: "+ freq);
        }

        List<Filme> lista = new ArrayList<>();
        Iterator iterator = setfilmes.iterator();
        while (iterator.hasNext()) {
            Filme f = (Filme) iterator.next();
            lista.add(f);
        }
        Collections.sort(lista);

        for (Filme filme : setfilmes) {
            System.out.println(filme.getTitulo());
        }
    }
}
