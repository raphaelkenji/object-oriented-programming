package Eletronico;

public class Produto {
    String id;
    String cor;
    double preco;

    public Produto (String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getCor() {
        return cor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean equals(Object o) {
        if (o instanceof Produto) {
            Produto u = (Produto) o;
            return this.getId().equals(u.getId());
        }
        return false;
    }

    public String toString() {
        return getId() + " - " + getCor() + " - " + getPreco();
    }
}
