package P2_2022_2.Ninja;

import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.Iterator;

public class Utils {
    public static Map retornaMapa (List ninjas) {
        Map mapa = new HashMap();
        Iterator ninja = ninjas.iterator();
        while (ninja.hasNext()) {
            Ninja n = (Ninja) ninja.next();
            mapa.put(n.getCpf(), n);
        }
        return mapa;
    }
}
