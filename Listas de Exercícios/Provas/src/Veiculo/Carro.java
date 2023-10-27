package Veiculo;

public class Carro extends Veiculo implements Abastecivel {
    private double tamanhoTanque = 30.0;
    private double quantidadeAtual;
    public Carro (String modelo) {
        super(modelo);
    }
    public boolean abastecer(double litros) {
        if (litros <= tamanhoTanque - quantidadeAtual) {
            quantidadeAtual += litros;
            return true;
        }
        return false;
    }
    public double getTamanhoTanque() {
        return tamanhoTanque;
    }

    public double getQuantidadeAtual() {
        return quantidadeAtual;
    }
    public void setQuantidadeAtual(double quantidadeAtual) {
        this.quantidadeAtual = quantidadeAtual;
    }
}
