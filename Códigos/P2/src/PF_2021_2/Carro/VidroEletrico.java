package PF_2021_2.Carro;

public class VidroEletrico extends Acessorio {
    public VidroEletrico (String marca, double preco) {
        super(marca, preco);
    }
    public double calcularImposto() {
        return preco * 0.2;
    }
}
