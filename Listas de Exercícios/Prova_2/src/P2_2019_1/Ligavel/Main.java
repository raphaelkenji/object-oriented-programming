package P2_2019_1.Ligavel;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List produtos = Utils.getLista();
        Produto produto = new Produto(scanner.nextLine());
        boolean x = Utils.existe(produtos, produto);
        if (x) {
            System.out.println(produtos.get(produtos.indexOf(produto)));
        } else {
            System.out.println("Produto não encontrado.");
        }
        Map<String, Produto> mapa = transformaListaEmMap(produtos);
        System.out.println(mapa);
    }

    public static Map<String, Produto> transformaListaEmMap (List k) {
        Map<String, Produto> mapa = new HashMap<>();
        Iterator iterator = k.iterator();
        while (iterator.hasNext()) {
            Produto produto = (Produto) iterator.next();
            mapa.put(produto.getId(), produto);
        }
        return mapa;
    }
}
