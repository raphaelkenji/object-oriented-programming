package P2_2019_1.Ligavel;

public class Produto {
    String id;
    String cor;
    double preco;

    public Produto(String id) {
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

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean equals (Object o) {
        if (o instanceof Produto p) {
            return this.getId().equals(p.getId());
        }
        return false;
    }

    public String toString() {
        return this.id + "/" + this.cor + "/" + this.preco;
    }

}
