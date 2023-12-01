package P2_2018_2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Mapa {
    public static void main(String[] args) {
        Map<String, Double> mapa = devolveMapa();
        double soma = contaA(mapa);
        System.out.println(soma);
    }

    public static double contaA(Map<String, Double> mapa) {
        Set<String> lista_str = mapa.keySet();
        Iterator<String> iterator = lista_str.iterator();
        double soma = 0.0;
        while (iterator.hasNext()) {
            String str = iterator.next();
            if (str.startsWith("A")) {
                soma += mapa.get(str);
            }
        }
        return soma;
    }

    public static Map<String, Double> devolveMapa() {
        Map<String, Double> mapa = new HashMap<>();
        mapa.put("A1", 5.0);
        mapa.put("A2", 6.3);
        mapa.put("A3", 7.0);
        mapa.put("BD21", 3.0);
        mapa.put("B2", 7.6);
        mapa.put("AC74", 2.0);
        mapa.put("A5", 8.0);
        mapa.put("B3", 3.0);
        return mapa;
    }
}
