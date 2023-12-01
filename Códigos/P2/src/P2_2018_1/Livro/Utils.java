package P2_2018_1.Livro;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Utils {
    public static void recebeLista(CarrinhoDeCompras c) {
        Iterator iterator = c.getLista().iterator();
        Map<String, Integer> mapa = new HashMap<>();
        while (iterator.hasNext()) {
            Livro livroc = (Livro) iterator.next();
            if (mapa.containsKey(livroc.getId())) {
                mapa.put(livroc.getId(), mapa.get(livroc.getId()) + 1);
            } else {
                mapa.put(livroc.getId(), 1);
            }
        }
        System.out.println(mapa);
    }
}
