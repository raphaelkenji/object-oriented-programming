package P2_2018_1.Livro;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List lista = new ArrayList();

    public List getLista() {
        return lista;
    }

    public void addLista(Object o) {
        lista.add(o);
    }
}
