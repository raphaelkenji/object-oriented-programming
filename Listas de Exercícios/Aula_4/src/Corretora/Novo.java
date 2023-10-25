package Corretora;

public class Novo extends Imovel {
    @Override
    public double getPreco() {
        return preco * 1.1;
    }
}
