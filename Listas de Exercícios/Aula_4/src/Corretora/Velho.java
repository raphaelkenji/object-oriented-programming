package Corretora;

public class Velho extends Imovel {
    @Override
    public double getPreco() {
        return preco * 0.90;
    }
}
