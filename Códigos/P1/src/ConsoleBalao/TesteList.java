package ConsoleBalao;

import java.util.ArrayList;
import java.util.List;
public class TesteList {
    public static void main(String[] args) {
        new Balao();
        List x = new ArrayList();
        Balao z = new Balao();
        z.setCor("preto");
        for (int i = 0; i < 3; i++) {
            x.add(z);
            z.setCor("amarelo"+ i);
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(((Balao)x.get(i)).getCor());
        }
        x.add(z);
        x.remove(3);
        teste1(x);
        for (int i = 0; i < 3; i++) {
            System.out.println(((Balao)x.get(i)).getCor());
        }
        z=new Balao();
        z.setCor("rosa");

        System.out.println(z.x);
    }
    public static void teste1(List k) {
        ((Balao)k.get(2)).setCor("marrom");
        ((Balao)k.get(0)).setCor("prata");
    }
}

