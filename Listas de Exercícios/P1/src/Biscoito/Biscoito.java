package Biscoito;

public class Biscoito {
    String id;
    String cor;
    int preco;

    public Biscoito (String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getCor() {
        return cor;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean equals (Object o) {
        if (o instanceof Biscoito u) {
            return this.getId().equals(u.getId());
        }
        return false;
    }
}
