package PF_2021_2.Carro;

import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class Utils2 {
    public static void imprimirCustos(List <Carro> carros) {
        double total = 0.0;
        double imposto = 0.0;
        for (int i = 0; i < carros.size(); i++) {
            Carro carro = carros.get(i);
            List <Acessorio> acessorios = carro.getAcessorios();
            for (int j = 0; j < acessorios.size(); j++) {
                Acessorio acessorio = acessorios.get(j);
                total += acessorio.getPreco();
                imposto += acessorio.calcularImposto();
            }
        }
        System.out.println("Total do preço de todos os acessórios: " + total);
        System.out.println("Total do preço dos impostos de todos os acessórios: " + imposto);
    }

    public Map <String, Carro> transformaListaEmMapa (List <Carro> carros) {
        Map <String, Carro> mapa = new HashMap<>();
        Iterator <Carro> it = carros.iterator();
        while (it.hasNext()) {
            Carro carro = it.next();
            mapa.put(carro.getPlaca(), carro);
        }
        return mapa;
    }
}
