package Biscoito;
import java.util.ArrayList;

public class Utils2 {
    public static ArrayList getLista(){
        ArrayList x = new ArrayList();

        Biscoito b = new Biscoito("123");
        b.setPreco(20);
        x.add(b);

        b = new Negresco("999");
        b.setPreco(10);
        x.add(b);

        b = new Skiny("666");
        b.setPreco(10);
        x.add(b);

        x.add(null);
        x.add(new Carro());
        x.add(new Elefante());

        return x;
    }
}
