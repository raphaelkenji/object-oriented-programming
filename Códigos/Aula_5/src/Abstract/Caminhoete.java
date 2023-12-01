package Abstract;

public class Caminhoete extends Abstrato {
    private final double PRECO_DIESEL = 14.3;
    public double calculaConsumoCombustivel() {
        return PRECO_DIESEL * 100;
    }
}
