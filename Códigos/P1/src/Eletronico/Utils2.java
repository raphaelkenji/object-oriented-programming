package Eletronico;
import java.util.ArrayList;
public class Utils2 {
    public static ArrayList getLista(){
        ArrayList x = new ArrayList();

        Produto b = new Produto("123");
        b.setPreco(20);
        x.add(b);

        b = new Notebook("999");
        b.setPreco(10);
        x.add(b);

        b = new Notebook("666");
        b.setPreco(10);
        x.add(b);

        x.add(null);
        x.add(new Carro());
        x.add(new Elefante());

        return x;
    }
}
