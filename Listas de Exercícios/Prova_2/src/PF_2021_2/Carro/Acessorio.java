package PF_2021_2.Carro;

public abstract class Acessorio {
    String marca;
    double preco;

    public Acessorio(String marca, double preco) {
        this.marca = marca;
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public abstract double calcularImposto ();
}
