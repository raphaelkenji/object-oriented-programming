package PF_2023_1.Escrever;

public class Caneta extends Escreve {
    private String cor;
    private static int quantidade;
    public Caneta() {
        System.out.println("X");
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        Caneta.quantidade = quantidade;
    }
}
