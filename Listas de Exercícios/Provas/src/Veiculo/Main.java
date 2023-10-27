package Veiculo;
import java.util.ArrayList;

public class Main {
    public static void main (String[] args) {
        BombaCombustivel bc = new BombaCombustivel();
        bc.setQuantidadeLitros(5000);
        Carro carro1 = new Carro("Toyota");
        ArrayList fila = new ArrayList();
        fila.add(carro1);
        bc.abastecerFila(fila);

        Carro carro2 = new Carro("Mercedes");
        Moto moto1 = new Moto("Honda");
        Moto moto2 = new Moto("Yamaha");
        fila.add(carro2);
        fila.add(moto1);
        fila.add(moto2);
        bc.abastecerFila(fila);
    }
}
