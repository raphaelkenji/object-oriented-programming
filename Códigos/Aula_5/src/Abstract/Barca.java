package Abstract;

public class Barca extends Abstrato {
    private final double PRECO_CARVAO = 10.1;
    public double calculaConsumoCombustivel() {
        return PRECO_CARVAO * 100;
    }
    public void dobrar() {

    }
}
