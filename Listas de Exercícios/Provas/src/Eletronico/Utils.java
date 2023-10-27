package Eletronico;
import java.util.ArrayList;
import java.util.List;

public class Utils {
    public static boolean existe (List x, Produto y) {
        if (x instanceof ArrayList) {
            return x.contains(y);
        }
        return false;
    }
}
