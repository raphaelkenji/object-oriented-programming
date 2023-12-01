package P2_2018_1.Livro.HashSet;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Livro> lista = new ArrayList<>();

    public List<Livro> getLista() {
        return lista;
    }

    public void adicionaLivro(Livro livro) {
        lista.add(livro);
    }
}

