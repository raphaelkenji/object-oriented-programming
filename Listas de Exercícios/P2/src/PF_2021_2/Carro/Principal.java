package PF_2021_2.Carro;

import java.util.List;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        List<Carro> carros = new ArrayList<>();

        Carro carro1 = new Carro();
        carro1.setPlaca("KXM-9835");
        carro1.addAcessorio(new VidroEletrico("X", 350.0));
        carro1.addAcessorio(new Som("JBL", 210));

        Carro carro2 = new Carro();
        carro2.setPlaca("LMM-0E65");
        carro2.addAcessorio(new VidroEletrico("Y", 350.0));
        carro2.addAcessorio(new Som("Raycon", 190));

        carros.add(carro1);
        carros.add(carro2);

        Utils2.imprimirCustos(carros);
    }
}
