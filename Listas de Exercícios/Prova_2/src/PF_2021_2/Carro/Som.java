package PF_2021_2.Carro;

public class Som extends Acessorio {

    public Som (String marca, double preco) {
        super(marca, preco);
    }
    public double calcularImposto() {
        return preco * 0.3;
    }
}
