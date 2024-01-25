import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Mapa {
    public static void main(String[] args) {
        Map<String, Double> mapa = criaMapa();
        double soma = contaA(mapa);
        System.out.println(soma);
    }

    public static double contaA(Map mapa) {
        double soma = 0.0;
        Set<String> set = mapa.keySet();
        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()) {
            String str = iterator.next();
            if (str.startsWith("A")) {
                soma += (double) mapa.get(str);
            }
        }
        return soma;
    }

    public static Map<String, Double> criaMapa() {
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
