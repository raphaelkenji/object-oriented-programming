package P2_2018_2.Doceria;

import java.util.Map;
import java.util.HashMap;
public class CriarMapa {
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
