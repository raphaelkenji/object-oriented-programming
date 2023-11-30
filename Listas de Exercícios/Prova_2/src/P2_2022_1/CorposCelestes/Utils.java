package P2_2022_1.CorposCelestes;

import java.util.Collections;
import java.util.Collection;
import java.util.List;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;

public class Utils  {
    public static boolean existe (Collection<CorpoCeleste> x, CorpoCeleste y) {
        return x.contains(y);
    }

    public static void ordena (List <CorpoCeleste> x) {
        Collections.sort(x);
    }

    public static Map <String, CorpoCeleste> retornaDados(Set<String> conjuntoCorpos) throws FormatoIncorretoException {
        Iterator <String> elementos = conjuntoCorpos.iterator();
        HashMap <String, CorpoCeleste> mapa = new HashMap<>();
        while (elementos.hasNext()) {
            String x = elementos.next();
            String[] y = x.split("#");
            if (y.length != 4) {
                throw new FormatoIncorretoException(x);
            }
            if (y[3].equals("P")) {
                Planeta planeta = new Planeta(y[0]);
                planeta.setNome(y[1]);
                planeta.setDistancia(Double.parseDouble(y[2]));
                mapa.put(y[0], planeta);
            }
            if (y[3].equals("E")) {
                Estrela estrela = new Estrela(y[0]);
                estrela.setNome(y[1]);
                estrela.setDistancia(Double.parseDouble(y[2]));
                mapa.put(y[0], estrela);
            }
        }
        return mapa;
    }
}
