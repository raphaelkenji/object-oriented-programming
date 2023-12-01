package P2_2018_2;

import P2_2018_2.Doceria.CriarMapa;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Mapa {
    public static void main(String[] args) {
        Map<String, Double> mapa = CriarMapa.devolveMapa();
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
}
