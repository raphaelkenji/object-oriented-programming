package ConsoleBalao;

public class Balao {
    private String cor;
    public static int x;
    public Balao() {
        x++;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
}

