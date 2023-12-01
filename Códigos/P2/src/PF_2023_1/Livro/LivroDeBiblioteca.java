package PF_2023_1.Livro;

public class LivroDeBiblioteca extends Livro {
    boolean alugado;

    public LivroDeBiblioteca (int ano, boolean alug) {
        super(ano);
        this.alugado = alug;
    }

    public void setAlugado(boolean alugado) {
        this.alugado = alugado;
    }

    public boolean isAlugado() {
        return alugado;
    }
}
