package PF_2023_1.Livro;

public class LivroDeLivraria extends Livro {
    boolean vendido;

    public LivroDeLivraria (int ano, boolean vend) {
        super(ano);
        this.vendido = vend;
    }

    public void setVendido(boolean vendido) {
        this.vendido = vendido;
    }

    public boolean isVendido() {
        return vendido;
    }

}
