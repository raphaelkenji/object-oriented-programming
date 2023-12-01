package Corretora;

public class Imovel {
    String endereco;
    double preco;

    public double getPreco() {
        return preco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String formataPreco(double preco) {
        return "R$ " + preco;
    }

    @Override
    public String toString() {
        return "Endereço: " + getEndereco() + " / Preço: " + formataPreco(getPreco());
    }
}
