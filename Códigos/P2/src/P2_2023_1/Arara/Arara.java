package P2_2023_1.Arara;

public class Arara {
    private String cor;
    public static int teste;
    private int idade;
    public Arara() {
        ++teste;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
}