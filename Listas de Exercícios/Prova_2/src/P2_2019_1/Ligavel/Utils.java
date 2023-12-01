package P2_2019_1.Ligavel;

import java.util.List;
import java.util.ArrayList;

public class Utils {
    public static boolean existe (List x, Produto y) {
        return x.contains(y);
    }

    public static List getLista() {
        List lista = new ArrayList();
        Produto produto = new Televisao("Sony");
        produto.setPreco(69420);
        produto.setCor("Preta");
        Produto produto1 = new Tapete("Walmart");
        produto1.setPreco(1337);
        produto1.setCor("Azul Listrado");
        lista.add(produto);
        lista.add(produto1);
        return lista;
    }

}
