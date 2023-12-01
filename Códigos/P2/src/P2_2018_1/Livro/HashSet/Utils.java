package P2_2018_1.Livro.HashSet;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Utils {
    public static void imprimeFrequencia(CarrinhoDeCompras carrinho) {
        Set<String> idsUnicos = new HashSet<>();

        for (Livro livro : carrinho.getLista()) {
            idsUnicos.add(livro.getId());
        }

        for (String id : idsUnicos) {
            int freq = Collections.frequency(carrinho.getLista(), new Livro(id));
            System.out.println("ID: " + id + ", Frequência: " + freq);
        }
    }
}