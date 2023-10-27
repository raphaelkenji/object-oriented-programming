package Biscoito;

import java.util.ArrayList;
import java.util.List;

public class Utils {
    public static boolean existe (List x, Biscoito y) {
        if (x instanceof ArrayList) {
            return x.contains(y);
        }
        return false;
    }
}

//         if (x instanceof ArrayList) {
//            return x.contains(y);
//        }
//        return false;